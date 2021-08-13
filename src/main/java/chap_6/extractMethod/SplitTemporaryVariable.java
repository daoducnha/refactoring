package chap_6.extractMethod;

public class SplitTemporaryVariable {
    private int height;
    private int width;

    public void example1() {
        double tmp = 2 * (height + width);
        System.out.println(tmp);
        tmp = height * width;
        System.out.println(tmp);

        //refactor

        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);

        final double area = height * width;
        System.out.println(area);
    }

    private int primaryForce;
    private int secondaryForce;
    private int mass;
    private int delay;

    public double getDistanceTravelled(int time) {
        /*
        double result;
        double acc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVel = acc * delay;
            acc = (primaryForce + secondaryForce) / mass;
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
        */

        // refactor
        double result;
        final double primaryAcc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * delay;
            final double secondaryAcc = (primaryForce + secondaryForce) / mass;
            result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
        }
        return result;
    }
}

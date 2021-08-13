package chap_6.extractMethod;

public class RemoveAssignmentsToParameters {
    public int discount(final int inputVal,
                        final int quantity,
                        final int yearToDate) {
        /*
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yearToDate > 10000) inputVal -= 4;

        return inputVal;
        */
        // refactor
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;

        return result;
    }

}

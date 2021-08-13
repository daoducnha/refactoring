package chap_6.extractMethod.replaceMethodWithMethodObject;

public class Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    public int delta() {
        return 5;
    }
}

package chap_6.extractMethod.replaceMethodWithMethodObject;

public class Gamma {
    private final Account account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    Gamma(Account account, int inputVal, int quantity, int yearToDate) {
        this.account = account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute() {
        importantValue1 = (inputVal + quantity) + account.delta();
        importantValue2 = (inputVal + yearToDate) + 100;

        importantThing();

        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }

    void importantThing() {
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
    }
}

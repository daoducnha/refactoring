package chap_7.move_field;

public class AccountSelfEncapsulation {
    private AccountType type;
    private double interestRate;

    double interestForAmount_days(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    public double getInterestRate() {
        return type.getInterestRate();
    }

    public void setInterestRate(double interestRate) {
        type.setInterestRate(interestRate);
    }
}

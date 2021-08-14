package chap_7.move_field;

public class Account {
    private AccountType type;

    double interestForAmount_days(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }

}
class AccountType {
    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

package chap_7.move_method;

public class Account {
    private AccountType type;
    private int dayOverdrawn;

    double bankCharge() {
        double result = 4.5;
        if (dayOverdrawn > 0) {
            result += type.overdraftCharge(this);
        }
        return result;
    }

    public int getDayOverdrawn() {
        return dayOverdrawn;
    }
}

class AccountType {
    double overdraftCharge(Account account) {
        if (isPremium()) {
            double result = 10;
            if (account.getDayOverdrawn() > 7) {
                result += (account.getDayOverdrawn() - 7) * 0.85;
            }
            return result;
        } else {
            return account.getDayOverdrawn() * 1.75;
        }
    }

    boolean isPremium() {
        return true;
    }
}

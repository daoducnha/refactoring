package chap_1;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRentalPoints(int daysRented) {
        return price.getFrequentRentalPoints(daysRented);
    }

    abstract class Price {
        abstract int getPriceCode();

        abstract double getCharge(int daysRented);

        int getFrequentRentalPoints(int daysRented) {
            return 1;
        }
    }

    class ChildrensPrice extends Price {
        int getPriceCode() {
            return Movie.CHILDRENS;
        }

        double getCharge(int daysRented) {
            double result = 1.5;
            if (daysRented > 3) {
                result += (daysRented - 3) * 1.5;
            }
            return result;
        }
    }

    class NewReleasePrice extends Price {
        int getPriceCode() {
            return Movie.NEW_RELEASE;
        }

        double getCharge(int daysRented) {
            return daysRented * 3;
        }

        @Override
        int getFrequentRentalPoints(int daysRented) {
            return (daysRented > 1) ? 2 : 1;
        }
    }

    class RegularPrice extends Price {
        int getPriceCode() {
            return Movie.REGULAR;
        }

        double getCharge(int daysRented) {
            double result = 2;
            if (daysRented > 2) {
                result += (daysRented - 2) * 1.5;
            }
            return result;
        }
    }
}


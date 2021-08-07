package chap_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    private String statement() {

        Iterator<Rental> iterator = rentals.iterator();
        String result = "chap_1.Rental record for " + getName() + "/n";
        while (iterator.hasNext()) {
            Rental each = iterator.next();

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }

        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "Your earned " + getFrequentRentalPoints() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Iterator<Rental> iterator = rentals.iterator();
        String result = "<h1>Rentals for <EM>" + getName() + "</EM></h1><p>\n";
        while (iterator.hasNext()) {
            Rental each = iterator.next();
            result += each.getMovie().getTitle() + ": " + each.getCharge() + "<br>\n";
        }

        // add footer lines
        result += "<p>You owe <em>" + getTotalCharge() + "<em><p>\n";
        result += "On this rental you earnd <em>" + getFrequentRentalPoints() + "<em> frequent renter points";

        return result;
    }


    private double getTotalCharge() {
        double result = 0;
        Iterator<Rental> iterator = rentals.iterator();

        while (iterator.hasNext()) {
            Rental each = iterator.next();
            result += each.getCharge();
        }
        return result;
    }

    private int getFrequentRentalPoints() {
        int result = 0;
        Iterator<Rental> iterator = rentals.iterator();

        while (iterator.hasNext()) {
            Rental each = iterator.next();
            result += each.getFrequentRentalPoints();
        }
        return result;
    }

}

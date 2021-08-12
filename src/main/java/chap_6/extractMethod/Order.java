package chap_6.extractMethod;

import java.util.*;

public class Order {
    private String name;
    private double amount;

    public Order(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Order> orders = Arrays.asList(
            new Order("Nha", 1000),
            new Order("Nhan", 2000),
            new Order("Thang", 3000),
            new Order("Dai", 4000)
    );

    void printOwing(double previousAmount) {
        printBanner();
        // calculate outstanding
        double outstanding = getOutstanding(previousAmount * 1.2);
        printDetails(outstanding);
    }
    private double getOutstanding(double initialValue) {
        double result = initialValue;
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order each = (Order) iterator.next();
            result += each.getAmount();
        }
        return result;
    }

    void printOwing() {
        Iterator iterator = orders.iterator();


        //        print banner
        printBanner();

        // calculate outstanding
        double outstanding = getOutstanding();

        // Print details
        printDetails(outstanding);
    }

    private void printBanner() {
        System.out.println("************************");
        System.out.println("**** Customer Owes *****");
        System.out.println("************************");
    }

    private void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    private double getOutstanding() {
        Iterator iterator = orders.iterator();
        double result = 0.0;
        while (iterator.hasNext()) {
            Order each = (Order) iterator.next();
            result += each.getAmount();
        }
        return result;
    }
}

package chap_8.change_value_to_reference;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = Customer.create(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }
}

class Customer {

    private final String name;

    private static HashMap instances = new HashMap();

    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Customer getName(String name) {
        return (Customer)instances.get(name);
    }

    static void loadCustomer() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private void store() {
        instances.put(this.getName(), this);
    }
}

class Client {

    private static int numberOfOrdersFor(Collection order, String customer) {
        int result = 0;
        Iterator iterator = order.iterator();
        while (iterator.hasNext()) {
            Order each = (Order) iterator.next();
            if (each.getCustomerName().equals(customer)) result++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}



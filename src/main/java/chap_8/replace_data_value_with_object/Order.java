package chap_8.replace_data_value_with_object;

import java.util.Collection;
import java.util.Iterator;

public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = new Customer(customerName);
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
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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



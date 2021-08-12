package chap_6.extractMethod;

public class ExtractMethod {

    private String name;
    private String amount;

    void printOwing(double amount) {
        printBanner();

        printDetails(amount);
//      System.out.println("Name: " + name);
//      System.out.println("amount: " + amount);

    }

    private void printBanner() {
        // do something
    }

    void printDetails(double amount) {
        System.out.println("Name: " + name);
        System.out.println("amount: " + amount);
    }
}

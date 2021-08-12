package chap_6.extractMethod;

public class IntroduceExplainingVariable {
    private String platform;
    private String browser;
    private int resize;

    void example1() {
        if ((platform.toUpperCase().indexOf("MAC") > -1)
                && (browser.toUpperCase().indexOf("IE") > -1)
                && wasInitialized() && resize > 0) {
            // do something
        }

        //refactor:
        final boolean isMacOS = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResided = resize > 0;

        if (isMacOS && isIEBrowser && wasInitialized() && wasResided) {
            // do something
        }
    }

    boolean wasInitialized() {
        return true;
    }


    private int quantity;
    private double itemPrice;

    public double price() {
        //price is base price - quantity discount  + shipping
        // origin code
        /*
            return quantity
                    * itemPrice
                    - Math.max(0, quantity - 500) * itemPrice * 0.05
                    + Math.min(quantity * itemPrice * 0.1, 100.0);
        */
        /*
        //refactor  Introduce Explaining Variable
        final double basePrice = quantity * itemPrice;
        final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
        final double shipping = Math.min(basePrice * 0.1, 100.0);
        return basePrice - quantityDiscount + shipping;
        */

        //refactor   Extract Method
        return basePrice() - quantityDiscount() + shipping();
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

    private double quantityDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(basePrice() * 0.1, 100.0);
    }


}

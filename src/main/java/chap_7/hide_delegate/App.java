package chap_7.hide_delegate;

public class App {
    public static void main(String[] args) {

        Person john = new Person();

        Person manager = john.getDepartment().getManager("String code");
        // hide delegate
        Person manager2 = john.getManager();
    }
}

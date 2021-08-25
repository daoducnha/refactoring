package chap_7.remove_middle_man;

public class App {
    public static void main(String[] args) {
        Person john = new Person();
//        Person manager = john.getManager();

        // Remove middle man
        Person manager2 = john.getDepartment().getManager();
    }
}

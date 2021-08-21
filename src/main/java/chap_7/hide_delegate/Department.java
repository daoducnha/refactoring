package chap_7.hide_delegate;

public class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager(String code) {
        return manager;
    }
}

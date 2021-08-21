package chap_7.extract_class;

public class Person {
    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

    public TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

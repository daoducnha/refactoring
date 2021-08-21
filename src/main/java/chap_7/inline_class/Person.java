package chap_7.inline_class;

public class Person {
    private String name;
    private String number;
    private String areaCode;

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return "(" + getAreaCode() + ") " + getNumber();
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}

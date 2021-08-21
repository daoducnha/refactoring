package chap_7.extract_class;

public class TelephoneNumber {
    private String areaCode;
    private String number;

    public String getTelephoneNumber() {
        return "(" + areaCode + ") " + number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

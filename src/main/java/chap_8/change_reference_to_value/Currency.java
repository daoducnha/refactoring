package chap_8.change_reference_to_value;

import java.util.Objects;

public class Currency {
    private String code;

    private Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Currency)) return false;
        Currency other = (Currency) o;
        return (code.equals(other.code));
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
    public static void main(String[] args) {
        System.out.println(new Currency("USD").equals(new Currency("USDT")));
    }
}

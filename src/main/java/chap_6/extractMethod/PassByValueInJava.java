package chap_6.extractMethod;

import java.util.Date;
import java.util.NoSuchElementException;

public class PassByValueInJava {
    public static void main(String[] args) {
        int x = 5;
        triple(x);
        System.out.println("x after triple: " + x);

        Date d1 = new Date("1 apr 98");
        nextDateUpdate(d1);
        System.out.println("d1 after nextDate: " + d1);

        Date d2 = new Date("1 apr 98");
        nextDateReplace(d2);
        System.out.println("d2 after nextDay: " + d2);

    }

    static void triple(int arg) {
        arg = arg * 3;
        System.out.println("arg in triplr: " + arg);
    }

    static void nextDateUpdate(Date arg) {
        arg.setDate(arg.getDate() + 1);
        System.out.println("arg in nextDate: " + arg);
    }

    static void nextDateReplace(Date arg) {
        arg = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
        System.out.println("arg in nextDate: " + arg);
    }

}

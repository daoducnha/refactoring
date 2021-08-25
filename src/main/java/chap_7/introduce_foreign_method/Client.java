package chap_7.introduce_foreign_method;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        Date previousEnd = new Date();
//        Date start = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
        Date start = nextDate(previousEnd);
    }

    private static Date nextDate(Date arg) {
        // foreign method, should be on Date
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }
}

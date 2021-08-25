package chap_7.introduce_local_extension;

import java.util.Date;

public class MfDateWrap {
    private Date origin;

    public MfDateWrap(String dateString) {
        origin = new Date(dateString);
    }

    public MfDateWrap(Date arg) {
        origin = arg;
    }

    public int getYear() {
        return origin.getYear();
    }

//
//    public boolean equals (MfDateWrap arg) {
//        return (toDate().equals(arg.toDate()))
//    }
}

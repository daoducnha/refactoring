package chap_7.introduce_local_extension;

import java.util.Date;

public class MfDateSub extends Date {
    public MfDateSub(String dateString) {
        super(dateString);
    }

    public MfDateSub(Date arg) {
        super(arg.getTime());
    }

    public Date nextDate () {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}

class Client {
    public static void main(String[] args) {
        MfDateSub currentDate = new MfDateSub("1/1/2011");
        Date nextDate = currentDate.nextDate();
    }
}




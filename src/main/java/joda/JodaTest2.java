package joda;

import org.joda.time.DateTime;

public class JodaTest2 {

    public static void main(String[] args) {

        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);

        System.out.println(tomorrow.toString("yyyy-MM-dd HH:mm"));

        today = today.withDayOfMonth(1);

        System.out.println(today.toString("yyyy-MM-dd HH:mm"));
    }
}

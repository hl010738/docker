package joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class JodaTest1 {

    public static String convert2localByDateFormat(Date date, String dateFormat){

        DateTime dateTime = new DateTime(date);
        return dateTime.toString(dateFormat);
    }

    public static Date convertUTC2Date(String utcDate){

        DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        Date date = dateTime.toDate();
        return date;
    }

    public static String convertDate2UTC(Date date){

        DateTime dateTime = new DateTime(date, DateTimeZone.UTC);
        String utc = dateTime.toString();
        return utc;
    }

    public static void main(String[] args) {

        System.out.println(JodaTest1.convertDate2UTC(new Date()));
        System.out.println(JodaTest1.convertUTC2Date("2017-10-20T06:32:09.147Z"));
        System.out.println(JodaTest1.convert2localByDateFormat(new Date(), "yyyy-MM-dd HH:mm"));
    }
}

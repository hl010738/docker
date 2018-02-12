package joda;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CycleDate {

    public static void main(String[] args) {

        Integer year = 2016;
        Integer month = 2;
        Integer date = 1;

        Integer hour = 16;
        Integer min = 30;
        Integer second = 4;

        // 2017-12-6 14:43:44

        String cycling = "22,30,31";

        String[] dates = cycling.split(",");

        String testDate = "2014-05-04 21:13:22";

        LocalDate localDate = LocalDate.of(year, month, date);
        LocalTime localTime = LocalTime.of(hour, min, second);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        Date d = new Date();

        System.out.println(d);

        Instant instant = d.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();

        LocalDateTime ldt = instant.atZone(zoneId).toLocalDateTime();
        System.out.println(ldt.format(formatter));
    }
}

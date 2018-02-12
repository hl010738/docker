package joda;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;

public class java8Time {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        localDate = LocalDate.of(2017, 3, 1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(localDate.format(dateTimeFormatter));

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);

        Set<String> ids = ZoneId.getAvailableZoneIds();
        TreeSet<String> set = new TreeSet<>();
        set.addAll(ids);

       set.stream().forEach(System.out::println);

        System.out.println("---------------");

        ZoneId zoneId = ZoneId.of("Asia/Singapore");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);
    }
}

package comparator;

import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("11111", "33333", "111222", "33334444");

        //Collections.sort(list, (o1, o2) -> o1.length() - o2.length());
        //Collections.sort(list, (o1, o2) -> o2.length() - o1.length());

        //Collections.sort(list, Comparator.comparingInt(String::length));
        //Collections.sort(list, Comparator.comparingInt(String::length).reversed());

        //Collections.sort(list, Comparator.comparingInt(i -> i.length()));
        //Collections.sort(list, Comparator.comparingInt((String i) -> i.length()).reversed());
        Collections.sort(list, Comparator.comparingInt(i -> ((String) i).length()).reversed());

        list.forEach(System.out::println);
    }
}

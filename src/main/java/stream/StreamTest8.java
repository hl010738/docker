package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest8 {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("111", "222", "333");
        List<String> list2 = Arrays.asList("aaa", "bbb", "ccc");

        List<String> result = list1.stream().flatMap(item1 -> list2.stream().map(item2 -> item1 + " " + item2)).collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}

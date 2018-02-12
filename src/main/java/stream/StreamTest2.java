package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void main(String[] args) {

        //字符串转换为流
        Stream<String> stream = Stream.of("11111111", "222222222222", "333333333333");

        //String[] arrays = stream.toArray(lenth -> new String[lenth]);

        String[] arrays = stream.toArray(String[]::new);

        Arrays.asList(arrays).forEach(System.out::println);

        System.out.println("-----------------");


        Stream<String> str = Stream.of("11111111", "222222222222", "333333333333");
        //List<String> list = str.collect(Collectors.toList());
        //List<String> list = str.collect(ArrayList::new, (theList, item) -> theList.add(item), (list1, list2) -> list1.addAll(list2));
        //List<String> list = str.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        //list.forEach(System.out::println);

        Set<String> set = str.collect(Collectors.toCollection(TreeSet::new));
        set.forEach(System.out::println);

    }
}

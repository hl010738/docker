package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {

    //<R> Stream<R> map(Function<? super T, ? extends R> mapper);
    //<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);

        //System.out.println(list.stream().map(i -> 2 * i).reduce(0, Integer::sum));

        List<String> list = Arrays.asList("333", "abcd", "1", "22");

        //这里map的作用就是将String转为Integer
        //list.stream().map(i -> i.length()).forEach(i -> System.out.println(i.getClass()));

        Stream<Integer> s = l.stream();
        Stream<Byte> ss = l.stream().map(i -> i.byteValue());
        Stream<String> sss = l.stream().flatMap(i -> list.stream());

        List<List<String>> flatList = Arrays.asList(Arrays.asList("1","2","3"), Arrays.asList("11", "22" ,"33"), Arrays.asList("111","222","333"));

        System.out.println(flatList.stream().flatMap(x -> x.stream()).mapToInt(y -> Integer.parseInt(y)).sum());

        Stream<Stream<String>> s1 = flatList.stream().map(i -> i.stream());
        Stream<String> s2 = flatList.stream().flatMap(i -> i.stream());
        Stream<Integer> s3 = flatList.stream().flatMap(i -> i.stream()).map(r -> Integer.parseInt(r));
    }
}

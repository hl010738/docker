package stream;

import java.util.stream.IntStream;

public class StreamTest6 {

    public static void main(String[] args) {

        //这样会产生无限流
        //IntStream.iterate(0, i -> (i + 1) % 2).distinct().limit(6).forEach(System.out::println);

        IntStream.iterate(0, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}

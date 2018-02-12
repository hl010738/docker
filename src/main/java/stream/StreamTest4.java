package stream;

import java.awt.event.ItemEvent;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {

        //Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        //stream.findFirst().ifPresent(System.out::println);

        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(7);

        //IntSummaryStatistics summaryStatistics = stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();

        //System.out.println(summaryStatistics.getMax());
        //System.out.println(summaryStatistics.getMin());
    }
}

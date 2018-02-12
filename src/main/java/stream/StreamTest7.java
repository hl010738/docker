package stream;



import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamTest7 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(5000000);

        for (int i = 0; i < 5000000; i++){
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("begin");

        long start = System.nanoTime();

        //list.stream().sorted().count();

        list.parallelStream().sorted().count();

        long end = System.nanoTime();

        long time = TimeUnit.NANOSECONDS.toMillis(end - start);

        System.out.println(time);
    }
}

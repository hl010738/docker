package collector;

import sun.applet.Main;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>> {

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
        //return () -> new HashSet<>();
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        //return (set, item) -> set.add(item);
        return Set<T>::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoked");
        //return t -> t;
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics");
        //return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED));
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("11111", "2222222", "3333333333", "444");

        Set<String> set = list.stream().collect(new MySetCollector<>());

        System.out.println(set);
    }
}

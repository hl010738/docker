package methodreference;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

    public String getString(Supplier<String> supplier){
        return supplier.get() + "1111111";
    }

    public String getString2(String s1, Function<String, String> function){
        return function.apply(s1);
    }

    public static void main(String[] args) {

        MethodReferenceTest test = new MethodReferenceTest();

        System.out.println(test.getString(String::new));

        System.out.println(test.getString2("222222", String::new));


        System.out.println("-----------");


        Student s1 = new Student("zhangsan", 80);
        Student s2 = new Student("lisi", 90);
        Student s3 = new Student("wangsu", 70);

        List<Student> list = Arrays.asList(s1, s2, s3);

        list.sort((student1, student2) -> Student.compareStudentByScore(student1, student2));

        list.forEach(s -> System.out.println(s.getScore()));

        System.out.println("-----------");

        list.sort(Student::compareStudentByScore);
        list.forEach(s -> System.out.println(s.getScore()));

        System.out.println("-----------");

        StudentComparator comparator = new StudentComparator();
        list.sort(comparator::compareStudentByScore);

        list.forEach(s -> System.out.println(s.getScore()));

        System.out.println("------------------");

        list.sort(Student::compareByScore);
        list.forEach(s -> System.out.println(s.getScore()));

        System.out.println("-------------");

        List<String> cities = Arrays.asList("guangzhou", "shenzhen", "beijing", "shanghai");

        Collections.sort(cities, (city1, city2) -> city1.compareToIgnoreCase(city2));
        cities.forEach(System.out::println);

        System.out.println("-------------");

        Collections.sort(cities, String::compareToIgnoreCase);
        cities.forEach(System.out::println);
    }
}

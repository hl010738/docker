package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest9 {

    public static void main(String[] args) {

        Student s1 = new Student("zhangsan", 100, 19);
        Student s2 = new Student("lisi", 80, 18);
        Student s3 = new Student("wangwu", 70, 21);
        Student s4 = new Student("zhangsan", 70, 18);

        List<Student> list = Arrays.asList(s1, s2, s3, s4);

        //Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getName));

        //Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));


        Map<Boolean, List<Student>> map = list.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));

        System.out.println(map);
    }
}

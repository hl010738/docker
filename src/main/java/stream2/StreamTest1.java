package stream2;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {

    public static void main(String[] args) {

        Student s1 = new Student("zhangsan", 80);
        Student s2 = new Student("lisi", 90);
        Student s3 = new Student("wangwu", 100);
        Student s4 = new Student("zhaoliu", 90);

        List<Student> list = Arrays.asList(s1, s2, s3, s4);

    }
}

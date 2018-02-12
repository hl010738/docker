package stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest5 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaaa", "bbbb", "ccccc");

        //list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1)).forEach(System.out::println);


        //stream 的中间操作必须有终止操作才会执行
        //相当于stream就是个容器，把中间操作都存储起来，遇到终止操作才会真正执行，解决循环效率问题
        list.stream().map(item -> {
            String result = item.substring(0, 1).toUpperCase() + item.substring(1);
            System.out.println("test");
            return result;
        });//代码块中的代码必须有forEach才会执行   .forEach(System.out::println);
    }
}

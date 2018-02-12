package com.shengsiyuan.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 implements MyInterface {
    @Override
    public void test2() {

    }

    public static void main(String[] args) {

        new Thread(() -> System.out.println("hello world")).start();

        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        //list.forEach(i -> System.out.println(i.toUpperCase()));

        list.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));

        list.stream().map(String::toUpperCase).forEach(i -> System.out.println(i));
    }

    @FunctionalInterface
    interface TheInterface{

        void method();
    }

    @FunctionalInterface
    interface TheInterface2{
        void method2();
    }
}

package com.shengsiyuan.jdk8;

import java.util.function.Function;

public class FunctionTest {


    public static void main(String[] args) {

        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(2, v -> 2 * v));
        System.out.println(test.compute(2, v -> 5 + v));
        System.out.println(test.convert(4, v -> "aaaa" + v));
    }


    public int compute(int a, Function<Integer, Integer> function){
        return function.apply(a);
    }

    public String convert(int a, Function<Integer, String> function){
        return function.apply(a);
    }
}

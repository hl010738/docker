package com.shengsiyuan.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {

        BinaryOperatorTest test = new BinaryOperatorTest();

        System.out.println(test.operator(1, 2, (a, b) -> a + b));

        System.out.println(test.getShort("11111", "222222", (a, b) -> a.length() - b.length()));
    }

    public String getShort(String a, String b, Comparator<String> comparator){
        return BinaryOperator.minBy(comparator).apply(a, b);
    }

    public int operator(int a, int b, BinaryOperator<Integer> operator){
        return operator.apply(a, b);
    }
}

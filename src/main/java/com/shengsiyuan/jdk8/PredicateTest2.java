package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        PredicateTest2 test2 = new PredicateTest2();

        test2.filter(list, i -> i % 2 == 0);

        System.out.println("----------------");

        test2.filter(list, i -> i % 2 != 0);

        System.out.println("------------");

        test2.filter(list, i -> true);

        System.out.println("----------------");

        System.out.println(test2.isEqual("test").test("test"));
    }

    public Predicate<String> isEqual(Object object){
        return Predicate.isEqual(object);
    }

    public void filter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2){

        for (Integer integer : list){
            if(predicate1.and(predicate2).test(integer)){
                System.out.println(integer);
            }
        }
    }


    public void filter(List<Integer> list, Predicate<Integer> predicate){

        for (Integer integer : list){
            if(predicate.test(integer)){
                System.out.println(integer);
            }
        }
    }
}

package com.shengsiyuan.jdk8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyInterface{

    abstract void test2();

    String toString();
}

public class Test2 {

    public void test2(MyInterface myInterface){

        myInterface.test2();
    }

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        test2.test2(new MyInterface() {
            @Override
            public void test2() {
                System.out.println("===========");
            }
        });

        test2.test2(() -> {
            System.out.println("----------------");
            System.out.println("0000000000000");
        });

        MyInterface myInterface1 = new Test3();

        System.out.println(myInterface1.getClass());
        System.out.println(myInterface1.getClass().getSuperclass());
        System.out.println(myInterface1.getClass().getInterfaces()[0]);

        System.out.println("...................");

        MyInterface myInterface = () -> {
            System.out.println("----------------");
            System.out.println("0000000000000");
        };


        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);

    }
}

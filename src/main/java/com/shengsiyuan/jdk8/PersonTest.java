package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person("zhangsan", 20);
        Person p2 = new Person("lisi", 30);
        Person p3 = new Person("wangwu", 40);

        List<Person> list = Arrays.asList(p1, p2, p3);

        PersonTest test = new PersonTest();
        List<Person> result = test.getPersonByUsername("zhangsan", list);
        result.forEach(p -> System.out.println("-----------" + p.getAge()));

        List<Person> r1 = test.getPersonByAge(25, list);
        r1.forEach(p -> System.out.println("========" + p.getAge()));

        List<Person> r2 = test.getPersonByAge2(25, list, (a, l) -> {
            return l.stream().filter(person -> person.getAge() > a).collect(Collectors.toList());
        });
        r2.forEach(person -> System.out.println(".........." + person.getUsername()));

        List<Person> r3 = test.getPersonByAge2(25, list, (a, l) -> {
            return l.stream().filter(person -> person.getAge() < a).collect(Collectors.toList());
        });
        r3.forEach(person -> System.out.println("+++++++++++++" + person.getUsername()));

    }

    public List<Person> getPersonByAge2(int age, List<Person> list, BiFunction<Integer, List<Person>, List<Person>> function){
        return function.apply(age, list);
    }


    public List<Person> getPersonByAge(int age, List<Person> list){
        BiFunction<Integer, List<Person>, List<Person>> function = (a, l) -> {
            return l.stream().filter(p -> p.getAge() > a).collect(Collectors.toList());
        };
        return function.apply(age, list);
    }


    public List<Person> getPersonByUsername(String username, List<Person> list){
        return list.stream().filter(p -> p.getUsername().equals(username)).collect(Collectors.toList());
    }
}

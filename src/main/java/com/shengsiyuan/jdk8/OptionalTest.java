package com.shengsiyuan.jdk8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();

        optional.ifPresent(i -> System.out.println(i));

        System.out.println(optional.orElse("222222"));

        System.out.println(optional.orElseGet(() -> "333333"));
    }
}

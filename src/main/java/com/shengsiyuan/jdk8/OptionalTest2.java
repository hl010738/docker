package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("111");

        Employee e2 = new Employee();
        e2.setName("222");

        Company company = new Company();
        company.setName("company");
        List<Employee> list = Arrays.asList(e1, e2);
        //company.setEmployees(list);

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(companies -> companies.getEmployees()).orElse(Collections.emptyList()));

    }
}

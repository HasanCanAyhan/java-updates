package com.cydeo.java12;

import java.util.*;
import java.util.stream.Collectors;

public class TeeingDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"A",100),
                new Employee(2,"B",200),
                new Employee(3,"C",300),
                new Employee(4,"D",400)
        );

        HashMap<String,Employee> result = employeeList.stream().collect(Collectors.teeing( // getting 2 collectors
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),// downstream1
                Collectors.minBy(Comparator.comparing(Employee::getSalary)),// downstream2
                (e1,e2) -> {
                    HashMap<String,Employee> map = new HashMap<>();
                    map.put("MAX " , e1.get());
                    map.put("MIN " , e2.get());
                    return map;
                }

        ));

        System.out.println(result);


    }


}


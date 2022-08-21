package com.cydeo;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("toCollection(Supplier) : is used to create a Collection using Collector");

        List<Integer> numberList =  numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("numberList = " + numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("numberSet = " + numberSet);

        System.out.println("--------------------------------");


    }

}

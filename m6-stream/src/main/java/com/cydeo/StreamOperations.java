package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        //list.forEach( x -> System.out.println(x));
        list.forEach(System.out::println);

        //Filter

        System.out.println("Filter: ");
        list.stream()
                .filter( i -> i%2 == 0 )
                .forEach(System.out::println); // closed stream

        System.out.println("Distinct: ");

        Stream<Integer> stream = list.stream()
                .filter( i -> i %2 == 0)
                .distinct();
        //intermediate operations return Stream object
        stream.forEach(System.out::println); // Stream is closed

        System.out.println("Limit: "); // highest price, top product, employee has the highest salary ......

        list.stream()
                .filter( i -> i %2 ==0 )
                .limit(1)
                .forEach(System.out::println);

        System.out.println("Skip: ");

        list.stream()
                .filter( i -> i %2 ==0 )
                .skip(1)
                .forEach(System.out::println);


        System.out.println("Map");
        list.stream()
                .map(number -> number*2)
                .filter(i -> i%3==0)
                .forEach(System.out::println);


    }

}

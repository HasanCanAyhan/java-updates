package com.cydeo.tasks.tasksAfterLesson.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareList { // page 7
    public static void main(String[] args) {


        //1.Given a list of numbers how would you return a list of the square of each
        //number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);

        List<Number> list4 = list3.stream()
                .map(p -> (p * p))
                .collect(Collectors.toList());

        System.out.println(list4);

        System.out.println("-------------------------------");

        System.out.println("2 : ");

        /*
        2. Given two lists of numbers, how would you return all pairs of numbers? For
            example, given a list [1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3),
            (2,4),(3,3),(3,4)]
            • List<Integer> numbers1 = Arrays.asList(1,2,3);
            • List<Integer> numbers2 = Arrays.asList(3,4);
            • List<int[]> pairs = ?????
         */

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<String> pairs = list1.stream()
                .flatMap(i -> list2.stream().map(j -> "{" + i+ "," + j + "}"))
                .collect(Collectors.toList());

        System.out.println("pairs = " + pairs);



    }
}

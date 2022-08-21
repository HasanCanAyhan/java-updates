package com.cydeo;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        //toCollection(Supplier)
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("-------toCollection(Supplier) : is used to create a Collection using Collector-----");

        List<Integer> numberList =  numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("numberList = " + numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("numberSet = " + numberSet);

        System.out.println("--------------------------------");

        //toList() in the Application-World
        System.out.println("toList() : returns  a Collector interface that gathers the input data into a new List");

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toList());

        System.out.println("numberList2 = " + numberList2);

        System.out.println("-------------------------------------------------");

        //toSet()

        System.out.println("toSet() : returns  a Collector interface that gathers the input data into a new Set");

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toSet());
        System.out.println("numberSet2 = " + numberSet2);

        System.out.println("---------------------------------------------");

        //toMap(Function,Function) returns Map

        System.out.println("toMap(Function,,Function) : returns a Collector interface that gathers the input data into a new Map");

        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap( Dish::getName,Dish::getCalories  ));
        System.out.println("dishMap = " + dishMap);

        System.out.println("-------------------------------------------------");

        System.out.println("summingInt(ToIntFunction) : returns a Collector that produces the sum of an Integer -valued function");
        //summingInt(ToIntFunction) : returns a Collector that produces the sum of an Integer -valued function
        //like reduce
       Integer sum =  DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println("sum = " + sum);

        System.out.println("----------------------------------------------------");
        //counting()
        System.out.println("counting() : returns a Collector that counts the number of the elements");

        Long evenCount = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.counting());

        System.out.println("evenCount = " + evenCount);

        System.out.println("----------------------------------------------------");

        //averagingInt(toIntFunction) : returns the average of the integers passed value

        System.out.println("averagingInt(toIntFunction) : returns the average of the integers passed value");

        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("calorieAverage = " + calorieAverage);

        System.out.println("-------------------------------------------------------");

        //joining() : is used to join various elements of a character or String array into a single object

        //like concat
        System.out.println("joining() : is used to join various elements of a character or String array into a single object\n");

        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println("str = " + str);

    }


}

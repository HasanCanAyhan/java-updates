package com.cydeo;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;

import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    // Terminal Operations

    public static void main(String[] args) {

        //All Match --- accept Predicate
        System.out.println("All Match :");
        boolean isHealthy = DishData.getAll().stream().allMatch( dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);//true

        System.out.println("Any Match : ");//--->> Predicate , one of them
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("None Match :");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2); // true


        System.out.println("Find Any : ");

        Optional<Dish> dish =  DishData.getAll().stream().filter(Dish::isVegetarian).findAny(); // it returns Optional, to prevents NullPointerException
        System.out.println(dish.get());


        System.out.println("Find First : ");

        Optional<Dish> dish2 =  DishData.getAll().stream().filter(Dish::isVegetarian).findFirst(); // it returns Optional, to prevents NullPointerException
        System.out.println(dish2.get());

        //Parallel Stream (Async)
        System.out.println("Parallel Stream");
        System.out.println(IntStream.range(0,100).parallel().findAny()); // can find anything randomly
        System.out.println(IntStream.range(0,100).parallel().findFirst());// can find the first one



    }



}

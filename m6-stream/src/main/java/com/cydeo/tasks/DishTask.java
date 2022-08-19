package com.cydeo.tasks;

import java.util.Comparator;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish`s name that has less than 400 calories

        DishData.getAll().stream()
                .filter( dish -> dish.getCalories() < 400)
                //.map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);
                //.forEach(dish -> System.out.println(dish.getName()));

        System.out.println("----------------------------------");
        //Print the length of the name of each dish

        DishData.getAll().stream()
                .map(dish -> dish.getName().length())
                //.map(Dish::getName)
                //.map(String::length)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //print three high caloric dish name(> 300)

        DishData.getAll().stream()
                .filter(p -> p.getCalories() > 300)
                .sorted( (Comparator.comparing( Dish::getCalories) ).reversed() )
                .limit(3)
                .forEach(System.out::println);

        System.out.println("------------------------------------------------");

        //print all dish name that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(p -> p.getCalories() < 400)
                .sorted(Comparator.comparing( Dish::getCalories  ) )
                .forEach(p -> System.out.println(p.getName()));


    }


}

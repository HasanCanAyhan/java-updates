package com.cydeo;

import com.cydeo.tasks.DishData;

public class FindingMatching {

    public static void main(String[] args) {

        //All Match --- accept Predicate

        System.out.println("All Match");
        boolean isHealthy = DishData.getAll().stream().allMatch( dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);




    }



}

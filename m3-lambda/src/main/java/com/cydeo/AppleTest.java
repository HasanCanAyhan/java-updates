package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        System.out.println("-----------------------");
        //                    lambda because Consumer Functional Interface
        inventory.forEach(apple -> System.out.println(apple));
        System.out.println("-----------------------");

        ApplePredicate abc = new AppleHeavyPredicate();
        List<Apple> heavyApple = filterApples(inventory,abc);
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);

        // interface
        // classes implementing interface
        // methods


        ApplePredicate weightApple = apple -> apple.getWeight() > 200;
        filterApples(inventory,weightApple);


    }

    // Task
    //convert to ready functional interface
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){ // interface
        //                                                          it looks for object
        List<Apple> result = new ArrayList<>(); // empty container

        for (Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }



}

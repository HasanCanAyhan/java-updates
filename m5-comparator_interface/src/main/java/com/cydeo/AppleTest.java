package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        //based on weight : if you wanna sort the object property, use comparing method
        Comparator<Apple> sortApple = comparing( (Apple apple) -> apple.getWeight());
        //                                                       Function interface
        inventory.sort(sortApple); // sort method waiting for action
        System.out.println(inventory);

        Comparator<Apple> sortApple2 = comparing( Apple::getWeight );
        inventory.sort(sortApple2);
        System.out.println(inventory);

        System.out.println("-------------------");

        //Reverse
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        System.out.println("----------------------------");

        //Chaining

        inventory
                .sort(comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getColor));

        System.out.println(inventory);

    }

}

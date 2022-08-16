package com.cydeo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {

        /*
        //Anonismus class

        ApplePredicate ap = new ApplePredicate() { // AppleHeavyPredicate class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

         */

        // we will choose interface according to Signature (parameter and return type)

        System.out.println("************PREDICATE************");

        // boolean test(T t); ready method
        Predicate<Integer> lesserThan = i -> i < 18; // implementation of the method in the Predicate Interface

        System.out.println(lesserThan.test(20)); // false

        System.out.println("************CONSUMER************");

        Consumer<Integer> display = i -> System.out.println(i); //void accept(T t); ready method
        display.accept(10);

        System.out.println("************BI CONSUMER************");

        //void accept(T t, U u); ready method
        BiConsumer<Integer,Integer>  addTwo = (x,y) -> System.out.println(x + y);
        addTwo.accept(1,2);


    }

}

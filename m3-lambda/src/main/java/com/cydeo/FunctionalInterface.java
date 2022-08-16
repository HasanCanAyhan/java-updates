package com.cydeo;

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

        //************PREDICATE************

        Predicate<Integer> lesserThan = i -> i < 18; // implementation of the method in the Predicate Interface

        System.out.println(lesserThan.test(20)); // false




    }

}

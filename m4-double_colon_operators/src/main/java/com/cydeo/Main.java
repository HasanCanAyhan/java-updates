package com.cydeo;


import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

       //Predicate<Integer> pred = (p) -> p % 2 == 0 ? true : false; // the implementation of abstract method inside the Functional Interface

        Calculate sum = (x,y) -> System.out.println(x +y);


        Calculate s1 = (x,y) -> Calculator.findSum(x,y); // implementation from the ready method which written before.

        Calculate s2 = Calculator ::findSum;

        s2.calculate(10,20);



    }


}

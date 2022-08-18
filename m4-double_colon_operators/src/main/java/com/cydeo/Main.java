package com.cydeo;


import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

       //Predicate<Integer> pred = (p) -> p % 2 == 0 ? true : false; // the implementation of abstract method inside the Functional Interface

        Calculate sum = (x,y) -> System.out.println(x +y);


        Calculate s1 = (x,y) -> Calculator.findSum(x,y); // implementation from the ready method which written before.

        //Reference to a Static Method
        Calculate s2 = Calculator ::findSum;
        s2.calculate(10,20);

        //Reference to an instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;

        //or : you can write this : same
        Calculate s4 = new Calculator()::findMultiply;

        //Ready function
        BiFunction<String,Integer,String> func = (str, i) -> str.substring(i); // implementation reference ready method in the String

        BiFunction<String,Integer,String> func2 = String :: substring;

        System.out.println("-------------------------------------------------");

        Function<Integer,Double> b = new MyClass() :: method;
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;

        // check static- called ClasName or instance - called objectName
        // FunctionalInterface : called ClassName

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;

        //FUNCTIONAL PROGRAMMING



    }


}

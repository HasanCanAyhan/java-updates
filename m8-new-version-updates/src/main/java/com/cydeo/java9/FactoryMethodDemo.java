package com.cydeo.java9;

import java.util.*;

public class FactoryMethodDemo { //.of() method

    public static void main(String[] args) {

        // creating unmodifiable List before Java 9

        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
        //courses.add("TS");
        System.out.println(courses);

        // creating unmodifiable List after Java 9
        List<String> myCourses = List.of("Java","Spring","Agile");

        // creating unmodifiable Set after Java 9
        Set<String> myProducts = Set.of("Milk","Bread","Butter");

        // creating unmodifiable Map after Java 9

        Map<String,Integer> myCart = Map.ofEntries(
          Map.entry("SAMSUNG TV",1),
          Map.entry("PSP",1),
          Map.entry("Chair",5)
        );



    }

}

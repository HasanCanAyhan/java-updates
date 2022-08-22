package com.cydeo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        // empty() - isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent()); // false


        System.out.println(Optional.of(number).isPresent()); // true

        System.out.println(empty.get());


        // ifPresent

        Optional<Integer> bigNumber = number.stream()
                .filter(x -> x > 100).findAny();


    }

}

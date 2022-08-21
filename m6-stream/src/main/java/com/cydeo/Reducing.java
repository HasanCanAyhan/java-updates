package com.cydeo;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        /*
        int sum = 0; ---->>> initial value
        for (Integer number : numbers) {
            sum = sum + number;
        }
         */

        int result =  numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("result = " + result);

        //Optional<Integer> result3 =  numbers.stream().reduce((a, b) -> a+b);

        System.out.println("Dish calories total: ");

        int result2 = DishData.getAll().stream()
                .map(Dish::getCalories) // only we have calories of Dish
                //.reduce( (a,b) -> a + b).get()
                .reduce(Integer::sum).get();

        System.out.println("result2 = " + result2);

        System.out.println("----------------------------------------------");
        //Max and Min

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum =numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());




    }
}

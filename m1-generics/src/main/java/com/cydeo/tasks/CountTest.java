package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountTest { // QS 2

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        //int count2 = countIf(ci, new EvenPredicate());
        System.out.println("Number of odd integers = " + count);



    }

    private static <T> int countIf(List<T> c, UnaryPredicate<T> p){ // we should this method generics, in order to use in the different Type....
        //                                      it should be parent class interface

        int count = 0;

        for (T elem : c ){
            if (p.test(elem)){
                count++;
            }
        }

        return count;

    }

}

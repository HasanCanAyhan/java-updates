package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValues { // QS 1

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};
        swap(a,0,2);

        System.out.println(Arrays.toString(a));


    }


    private static void swap(Integer[] a , int i, int j){

        Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;


    }


}

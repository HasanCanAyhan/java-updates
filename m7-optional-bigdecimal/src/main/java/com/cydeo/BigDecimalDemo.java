package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {


        double amount1 = 374.56;
        double amount2 = 374.26;

        System.out.println(amount1-amount2); // 0.30000000000001137

        BigDecimal b1 = new BigDecimal("374.56"); // constructor
        BigDecimal b2 = new BigDecimal("374.26");

        //System.out.println(b1 - b2); you can not do it is object

        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 =  BigDecimal.TEN;
        BigDecimal b5 =  BigDecimal.ONE;

        System.out.println(b1.subtract(b2)); // 0.30

        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(new BigDecimal("15.00")));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));

        System.out.println("---------------------------------------------------");
        // Scalling

        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING)); // 1 is digit
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));
        System.out.println(number1.setScale(2, RoundingMode.FLOOR));
        System.out.println(number1.setScale(2, RoundingMode.CEILING));

        System.out.println("---------------------------------------------------");

        // Do not use equals() . Use compareTo()

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));//0
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));//1
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));//-1



    }

}

class Employee{
    private String name;
    private BigDecimal salary;
   // private double salary; not any more !! --->> BigDecimal
}
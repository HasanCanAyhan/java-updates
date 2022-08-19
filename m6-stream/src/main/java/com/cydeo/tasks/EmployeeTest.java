package com.cydeo.tasks;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //print all emails

        System.out.println("Print All Emails");
        EmployeeData.readAll()
                //.map(Employee :: getEmpEmail ) or:
                .map(employee -> employee.getEmpEmail())
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        System.out.println("Print All Phone Numbers");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        System.out.println("Print All Phone Numbers with Double Colon");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap( List:: stream)
                .forEach(System.out::println);

    }
}

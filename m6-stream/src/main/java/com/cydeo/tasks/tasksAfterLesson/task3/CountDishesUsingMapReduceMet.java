package com.cydeo.tasks.tasksAfterLesson.task3;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;

import java.util.Optional;
import java.util.stream.Collectors;

public class CountDishesUsingMapReduceMet {

    public static void main(String[] args) {  // Task 3 page of slide is 16

        Long count = DishData.getAll().stream()
                .collect(Collectors.counting());

        System.out.println("count = " + count);


        System.out.println("-------------------------------");



    }

}

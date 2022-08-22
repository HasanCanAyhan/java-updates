package com.cydeo.tasks.tasksAfterLesson;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;

import java.util.Optional;
import java.util.stream.Collectors;

public class CountDishesUsingMapReduceMet {

    public static void main(String[] args) {  // Task 1 page of slide is 16

        Long count = DishData.getAll().stream()
                .collect(Collectors.counting());

        System.out.println("count = " + count);

    }

}

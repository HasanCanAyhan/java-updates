package com.cydeo.tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
     private String name;
     private boolean vegetarian;
     private int calories;
     private Type type;
}
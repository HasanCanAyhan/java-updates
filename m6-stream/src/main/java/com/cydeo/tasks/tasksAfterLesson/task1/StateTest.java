package com.cydeo.tasks.tasksAfterLesson.task1;

import java.util.ArrayList;
import java.util.List;

public class StateTest { // Task1 page is 6

    public static void main(String[] args) {

        State state = new State();
        state.addCity("Istanbul");
        state.addCity("Frankfurt");
        state.addCity("Berlin");
        state.addCity("Stuttgart");

        List<State> list = new ArrayList<>();
        list.add(state);

        list.stream()
                .flatMap(state1 -> state1.getCities().stream())
                .forEach(System.out::println);


    }


}
/*
Suppose we have a State class that contains list of cities. Create a list
of States and print all the cities.

public class State {
private List<String> cities = new ArrayList<>();
public void addCity(String city){
cities.add(city);
}
public List<String> getCities(){
return this.cities;
}
}

 */
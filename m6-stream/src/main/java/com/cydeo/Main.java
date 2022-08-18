package com.cydeo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //creating Stream from Array

        String[] courses = {"Java","Spring","Agile"};

        Stream<String> courseStream  = Arrays.stream(courses);

        //creating Stream from Collection

        List<String> courseList = Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
          new Course("Java",100),
          new Course("DS",1001),
          new Course("MS",1002)
        );

        Stream<Course> myCourseStream = myCourses.stream(); // each flow in the Stream

        //operations

        myCourseStream.




    }

}

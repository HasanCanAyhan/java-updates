package com.cydeo;

public enum Operation {

    PLUS,MINUS,MULTIPLY,DIVIDE; // each constant is object(new) of operation




    private Operation() { // 4 times executed because each of them is object of Operation
        System.out.println("Constructor");

    }
}

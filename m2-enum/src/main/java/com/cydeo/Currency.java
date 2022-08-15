package com.cydeo;


public enum Currency { // only have constant objects
    // enum is static - final , that`s why we can not put abstract

    PENNY(1),NICKLE(5),DIME(10),QUARTER(25); // PENNY is an object of currency class

    private int value;

    Currency(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }


}

package com.mycompany.tddframework.core;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("/ by zero");
        return a / b;
    }


}

package com.dailycoder.class_04;

public interface Calculator {
    int calculate(int a, int b);
    default void printResult(int result) {
        System.out.println("The result is: " + result);
    }
}

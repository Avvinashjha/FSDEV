package com.dailycoder.lab_polymorf;

public class Calculator extends SuperCal{
//    public int add(int a, int b) {
//        return a + b;
//    }


    public int add(int a, double b){
        System.out.println("int + double");
        return (int)(a + b);
    }

    public double add(double a, double b){
        System.out.println("double + double");
        return a + b;
    }



}

package com.kairos.java.refresher.classes;

public class Calculator {

    public int add(int number1, int number2) {
        return number1 + number2;
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(3, 5));
    }
}

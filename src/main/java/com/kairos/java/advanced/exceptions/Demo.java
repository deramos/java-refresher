package com.kairos.java.advanced.exceptions;

public class Demo {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            int result = i / j;
        } catch (ArithmeticException e) {
            System.out.println("Error diving elements "+e);
        }
    }
}

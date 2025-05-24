package com.kairos.java.advanced.exceptions;

class ChideraException extends Exception {
    public ChideraException(String message) {
        super(message);
    }
}

public class Demo {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            if(j == 0)
                throw new ChideraException("experimenting with custom exception");
            int result = i / j;
        } catch (ChideraException e) {
            System.out.println("Error diving elements "+e);
        }
    }
}

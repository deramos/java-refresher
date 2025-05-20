package com.kairos.java.refresher.intro;

import java.util.Random;

public class Conditionals {

    public static void main(String... args) {
        Random generator = new Random();
        int x = generator.nextInt(50);

        if(x > 10 && x % 10 == 0) {
            System.out.printf("Hello... %d\n", x);
        }
        else {
            System.out.printf("Bye... %d", x);
        }
    }
}

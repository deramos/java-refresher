package com.kairos.java.refresher.intro;

import java.util.Random;

public class Conditionals {

    public static void main(String... args) {
        Random generator = new Random();
        int x = generator.nextInt(50);

        if(x > 10 && x % 2 == 0) {
            System.out.printf("Hello... %d\n", x);
        }
        else {
            System.out.printf("Bye... %d", x);
        }

        int n = 4;
        switch(n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

        }

    }
}

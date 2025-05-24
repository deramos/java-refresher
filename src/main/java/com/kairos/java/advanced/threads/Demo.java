package com.kairos.java.advanced.threads;

public class Demo {
    public static void main(String[] args) {
        Runnable a = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        };

        Runnable b = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        };

        Thread t = new Thread(a);
        t.start();
        Thread t2 = new Thread(b);
        t2.start();
    }
}

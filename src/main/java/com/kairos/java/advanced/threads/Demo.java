package com.kairos.java.advanced.threads;

class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

class B extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}

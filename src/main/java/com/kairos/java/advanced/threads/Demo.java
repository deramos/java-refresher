package com.kairos.java.advanced.threads;

class A extends Thread {
    public void run() {
        for (int i=0; i<50; i++)
            System.out.println("Hi");
    }
}

class B extends Thread {
    public void run() {
        for (int i=0; i<50; i++)
            System.out.println("Hello");
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

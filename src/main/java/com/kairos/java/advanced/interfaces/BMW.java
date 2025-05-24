package com.kairos.java.advanced.interfaces;

abstract class Car implements Driveable {
    abstract void service();
}

@FunctionalInterface
interface A {
    void show(int i);
}

public class BMW extends Car implements Driveable {

    @Override
    void service() {
        System.out.println("Time to service");
    }

    @Override
    public void drive() {
        System.out.println("Zoom zoom "+ Driveable.message);
    }

    public static void main(String[] args) {
        BMW myCar = new BMW();
        myCar.drive();

        A a = new A() {
            @Override
            public void show(int i) {
                System.out.println("In show " +i);
            }
        };

        A aa = (i) -> System.out.println("In lambda show..."+i);

        aa.show(5);
    }
}

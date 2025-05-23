package com.kairos.java.advanced.interfaces;

abstract class Car implements Driveable {
    abstract void service();
}


public class BMW extends Car implements Driveable {

    @Override
    void service() {
        System.out.println("Time to service");
    }

    @Override
    public void drive() {
        System.out.println("Zoom zoom");
    }
}

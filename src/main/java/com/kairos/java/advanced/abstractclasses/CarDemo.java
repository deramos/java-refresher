package com.kairos.java.advanced.abstractclasses;

abstract class Car {
    public abstract void drive();
    public void playMusic() {
        System.out.println("Play Music");
    }

}

class BWM extends Car {

    @Override
    public void drive() {
        System.out.println("BMW Drives");
    }
}

public class CarDemo {
    public static void main (String... args) {
        Car car = new BWM();
        car.drive();
        car.playMusic();
    }
}
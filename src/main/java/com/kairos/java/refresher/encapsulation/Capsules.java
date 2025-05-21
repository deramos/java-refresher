package com.kairos.java.refresher.encapsulation;

class Human {
    private String name;
    private int age;

    @Override
    public String toString(){
        return this.name + ", aged: " + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}

abstract class Animal {
    public Animal() {
        System.out.println("Inside animal");
    }
    String name;
    String breed;
}

abstract class Runner extends Animal {
    public Runner() {
        System.out.println("Inside runner");
    }
    String action;
}

class Dog extends Runner {
    String bark;
    public Dog() {
        System.out.println("inside dog");
    }
    public Dog(String name) {
        this();
        this.name = name;
        this.breed = "Husky";
        this.bark = "whoof";
    }

    @Override
    public String toString(){
        return this.name + " is a " + this.breed + " who " + this.bark + "s";
    }
}


public class Capsules {
    public static void main(String[] args) {
        Dog husky = new Dog("Jimmy");
        System.out.println(husky);
    }
}

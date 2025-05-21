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


public class Capsules {
    public static void main(String[] args) {
        Dog husky = new Dog();
        System.out.println(husky);
    }
}

abstract class Animal {
    String name;
    String breed;
}

abstract class Runner {
    String action;
}

class Dog extends Animal {
    String bark;

    public Dog() {
        this.name = "Jimmy";
        this.breed = "Husky";
        this.bark = "whoof";
    }

    @Override
    public String toString(){
        return this.name + " is a " + this.breed + " who " + this.bark + "s";
    }
}
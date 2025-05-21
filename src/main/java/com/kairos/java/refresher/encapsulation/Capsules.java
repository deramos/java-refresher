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
        Human human = new Human();
        human.setName("Chidera");
        human.setAge(11);

        System.out.println(human.toString());
    }
}

package com.kairos.java.enums;

enum Status {
    Scheduled,
    Running,
    Failed,
    Succeeded;
}

enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

    private int price;

    Laptop(int price){
        this.price = price;
    }

    int getPrice() {
        return this.price;
    }

    void setPrice(int price) {
        this.price = price;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Laptop laptop = Laptop.Macbook;
        System.out.println(laptop.name());
        System.out.println(laptop.getPrice());
    }
}

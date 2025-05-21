package com.kairos.java.refresher.statics;

public class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(this.brand + " : " + price + " : " + name);
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.brand = "Apple";
        mobile.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 1700;
        Mobile.name = "DumbPhone";

        mobile.show();
        mobile2.show();
    }
}

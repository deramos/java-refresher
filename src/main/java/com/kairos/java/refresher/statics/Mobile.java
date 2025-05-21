package com.kairos.java.refresher.statics;

class MobileClass {
    String brand;
    int price;
    static String name;

    static {
        name = "SmartPhone";
        System.out.println("static block");
    }

    public void show() {
        System.out.println(this.brand + " : " + price + " : " + name);
    }

    public static void show1(MobileClass obj) {
        System.out.println("In static method");
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Mobile {
    public static void main(String[] args) throws ClassNotFoundException {
//        MobileClass mobile = new MobileClass();
//        mobile.brand = "Apple";
//        mobile.price = 1500;
//        MobileClass.name = "SmartPhone";
//
//        MobileClass mobile2 = new MobileClass();
//        mobile2.brand = "Samsung";
//        mobile2.price = 1700;
//        MobileClass.name = "DumbPhone";
//
//        mobile.show();
//        mobile2.show();
//
//        MobileClass.show1(mobile2);

        Class.forName("com.kairos.java.refresher.statics.MobileClass");
    }
}

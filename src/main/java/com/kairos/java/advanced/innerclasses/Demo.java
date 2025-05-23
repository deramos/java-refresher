package com.kairos.java.advanced.innerclasses;


class A {
    public void show() {
        System.out.println("In A. Show");
    }

    static class B {
        public void show() {
            System.out.println("In B. Show");
        }
    }
}


abstract class B {
    abstract void show();
}

public class Demo {
    public static void main(String[] args) {
        B b = new B() {

            @Override
            void show() {
                System.out.println("Showing inner B");
            }
        };
        b.show();
    }

}

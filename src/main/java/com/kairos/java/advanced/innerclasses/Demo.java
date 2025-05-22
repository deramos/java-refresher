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


public class Demo {
    public static void main(String[] args) {
        A.B b = new A.B();
        b.show();
    }

}

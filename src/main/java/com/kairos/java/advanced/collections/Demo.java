package com.kairos.java.advanced.collections;

import java.util.*;

class Student {
    Map<String, Integer> students;

    public synchronized void addStudent(String name, int grade) {
        students.put(name, grade);
    }
}

public class Demo {
    public static void main(String[] args) {

        Map<String, Integer> students = new TreeMap<>();
        students.put("Navin", 56);
        students.put("Harsh", 45);
        students.put("Sushil", 67);
        students.put("Kiran", 45);


        for(String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}

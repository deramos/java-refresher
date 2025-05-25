package com.kairos.java.advanced.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.age;
    }

    @Override
    public int compareTo(Student that) {
        return this.age - that.age;
    }
}


public class Demo {
    public static void main(String[] args) throws UnsupportedOperationException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Chidera", 35));
        students.add(new Student("Onyinye", 29));
        students.add(new Student("Chinelo", 27));
        students.add(new Student("Amaka", 33));

        students.sort(( o1, o2) -> o1.age - o2.age);
        for (Student t : students) {
            System.out.println(t);
        }

        System.out.println("--- ---- ---- ---");

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Chidera", 35));
        studs.add(new Student("Onyinye", 29));
        studs.add(new Student("Chinelo", 27));
        studs.add(new Student("Amaka", 33));

        Collections.sort(studs);

        for(Student s: studs){
            System.out.println(s);
        }

    }
}

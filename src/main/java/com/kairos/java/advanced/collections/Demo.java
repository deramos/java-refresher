package com.kairos.java.advanced.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

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
        List<Integer> nums = Arrays.asList(1, 4, 2, 5, 7, 0, 3, 6);
        Stream<Integer> stream = nums.stream();

        stream.forEach(System.out::println);

        nums.stream().filter(n -> n%2 ==0).forEach(System.out::println);

    }
}

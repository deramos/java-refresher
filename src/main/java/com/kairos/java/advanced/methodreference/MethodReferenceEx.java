package com.kairos.java.advanced.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Chidera", "John");
        List<String> uNames = names.stream().map(String::toUpperCase).toList();

        uNames.forEach(System.out::println);


    }
}

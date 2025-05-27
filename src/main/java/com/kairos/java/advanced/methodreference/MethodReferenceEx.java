package com.kairos.java.advanced.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Chidera", "John");
        List<String> uNames = names.stream().map(name -> name.toUpperCase()).toList();

        System.out.println(uNames);
    }
}

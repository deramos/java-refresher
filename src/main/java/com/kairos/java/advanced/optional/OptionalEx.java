package com.kairos.java.advanced.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chidera", "Navin", "John", "Kosher");

        Optional<String> name = names
                .stream()
                .filter(n -> n.equals("Chidera"))
                .findFirst();
        System.out.println(name.orElse("Not Found"));
    }
}

package com.kairos.java.advanced.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int size = 10_000;

        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for(int i=0; i<=size; i++) {
            nums.add(ran.nextInt(100));
        }

        int sum1 = nums.stream()
                .map(i -> i*2)
                .reduce(0, Integer::sum);

        int sum2 = nums.stream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();

        System.out.println(sum1 + " " +sum2);
    }
}

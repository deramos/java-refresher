package com.kairos.java.advanced.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);

        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}

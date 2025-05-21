package com.kairos.java.refresher.arrays;

import java.util.Arrays;

public class ArrayHandler {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 8;
        arr1[2] = 9;
        arr1[3] = 10;

        int[][] arr2 = new int[3][3];
        arr2[0][0] = 3;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr2));
    }
}

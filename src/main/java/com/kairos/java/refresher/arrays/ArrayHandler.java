package com.kairos.java.refresher.arrays;

import java.util.Arrays;

class Student {
    String name;
    int rollno;
    int marks;
}

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

        for(int[] i : arr2){
            for (int j: i) {
                System.out.println(j);
            }
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        Student s1 = new Student();
        s1.name = "Chidera";
        s1.rollno = 1;
        s1.marks = 40;

        Student s2 = new Student();
        s2.name = "Kamsi";
        s2.rollno = 3;
        s2.marks = 99;

        Student s3 = new Student();
        s3.name = "Nkem";
        s3.rollno = 2;
        s3.marks = 90;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student s: students) {
            System.out.println(s.name);
            System.out.println(s.rollno);
            System.out.println(s.marks);
            System.out.println("--- ---- ---");
        }
    }
}

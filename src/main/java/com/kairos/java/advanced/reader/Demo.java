package com.kairos.java.advanced.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        int num = Integer.parseInt(reader.readLine());
        System.out.println(num);

        reader.close();

        // trying try with resource
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String number = br.readLine();
            System.out.println(number);
        }
    }
}

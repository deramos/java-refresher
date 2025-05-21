package com.kairos.java.refresher.strings;

public class StringHandler {
    public static void main(String[] args) {
        String name = "Chidera";
        boolean isCaller = true;
        System.out.println(name.concat(" Mosanya"));

        StringBuffer buffer = new StringBuffer("Chidera");
        buffer.append(" Mosanya");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello...");
        builder.append(" World!");

        System.out.println(builder.toString());

        String st = buffer.toString();
    }
}

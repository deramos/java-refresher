package com.kairos.java.enums;

enum Status {
    Scheduled,
    Running,
    Failed,
    Succeeded;
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.Scheduled;
        System.out.println(s);

        for(Status ss: Status.values()) {
            System.out.println(ss);
        }
    }
}

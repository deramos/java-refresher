package com.kairos.java.enums;

enum Status {
    Scheduled,
    Running,
    Failed,
    Succeeded;
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.Failed;
        System.out.println(s);

        if (s == Status.Scheduled) {
            System.out.println("Status Scheduled");
        } else if (s == Status.Running) {
            System.out.println("Status Running");
        } else if (s == Status.Failed) {
            System.out.println("Status Failed");
        } else {
            System.out.println("Status Succeeded");
        }

        // Switch Statement with Enums
        Status ss = Status.Succeeded;
        switch (ss) {
            case Scheduled:
                System.out.println("Status Scheduled");
                break;
            case Running:
                System.out.println("Status Running");
                break;
            case Failed:
                System.out.println("Status Failed");
                break;
            default:
                System.out.println("Status Succeeded");
                break;
        }
    }
}

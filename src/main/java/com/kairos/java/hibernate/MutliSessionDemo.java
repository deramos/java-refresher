package com.kairos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MutliSessionDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Laptop laptop = session.find(Laptop.class, 1);

        System.out.println(laptop);

        session.close();

        Session session1 = factory.openSession();

        Laptop laptop2 = session1.find(Laptop.class, 1);

        System.out.println(laptop2);

        session1.close();
        factory.close();
    }
}

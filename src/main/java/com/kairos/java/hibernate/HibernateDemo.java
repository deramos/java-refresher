package com.kairos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class HibernateDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(16);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook Pro");
        l3.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setName("Chidera");
        a1.setTech("Java");
        a1.setLaptops(List.of(l1, l2));

        Alien a2 = new Alien();
        a2.setAid(2);
        a2.setName("Chidera");
        a2.setTech("Python");

        a1.setLaptops(List.of(l1, l2));
        a2.setLaptops(List.of(l3));


        Configuration configuration = new Configuration();
        configuration.configure();

        Session session;
        try (SessionFactory factory = configuration.buildSessionFactory()) {
            session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            session.persist(l1);
            session.persist(l2);
            session.persist(l3);
            session.persist(a1);
            session.persist(a2);

            Alien a2_new = session.find(Alien.class, 2);

            transaction.commit();

            System.out.println(a2_new);
        }

    }
}

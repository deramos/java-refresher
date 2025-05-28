package com.kairos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setBrand("Asus");
        laptop.setModel("Rog");
        laptop.setRam(16);

        Alien alien = new Alien();
        alien.setAid(3);
        alien.setName("Chidera");
        alien.setTech("Java");
        alien.setLaptop(laptop);

        Alien a2 = null;
        Laptop l2 = null;

        Configuration configuration = new Configuration();
        configuration.configure();

        Session session;
        try (SessionFactory factory = configuration.buildSessionFactory()) {
            session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            session.persist(laptop);
            session.persist(alien);

            a2 = session.find(Alien.class, 3);
            l2 = session.find(Laptop.class, 1);

            transaction.commit();

            System.out.println(a2);
            System.out.println(l2);
        }

    }
}

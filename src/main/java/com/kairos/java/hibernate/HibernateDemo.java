package com.kairos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.setAid(1);
        alien.setName("Chidera");
        alien.setTech("Java");

        Alien a2 = null;

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.kairos.java.hibernate.Student.class);
        configuration.configure();

        Session session;
        try (SessionFactory factory = configuration.buildSessionFactory()) {
            session = factory.openSession();

            Transaction transaction = session.beginTransaction();
            a2 = session.find(Alien.class, 1);

            session.persist(alien);

            transaction.commit();

            System.out.println(a2);
        }

    }
}

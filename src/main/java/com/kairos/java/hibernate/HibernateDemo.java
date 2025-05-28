package com.kairos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSid(11);
        s1.setsName("Nkem");
        s1.setMarks(90);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.kairos.java.hibernate.Student.class);
        configuration.configure();

        Session session;
        try (SessionFactory factory = configuration.buildSessionFactory()) {
            session = factory.openSession();
        }

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

    }
}

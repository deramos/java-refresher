package com.kairos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSid(12);
        s1.setsName("Sally");
        s1.setMarks(89);

        Student s2 = null;

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.kairos.java.hibernate.Student.class);
        configuration.configure();

        Session session;
        try (SessionFactory factory = configuration.buildSessionFactory()) {
            session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            s2 = session.merge(s1);

            transaction.commit();

            System.out.println(s2);
        }

    }
}

package com.kairos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSid(7);
        s1.setsName("Chidera");
        s1.setMarks(89);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.kairos.java.hibernate.Student.class);
        configuration.configure();

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.persist(s1);

    }
}

package com.kairos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class HibernateDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        Session session;
        try (SessionFactory factory = configuration.buildSessionFactory()) {
            session = factory.openSession();

            Query query = session.createQuery("select model, brand from Laptop where brand like ?1");
            query.setParameter(1, "Asus");
            List<Object[]> laptops = query.getResultList();

            for(Object[] o : laptops) {
                System.out.println((String) o[0]);
            }

        }

    }
}

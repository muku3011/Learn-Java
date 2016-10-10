package com.xtra.hibernate;

import org.hibernate.Session;

import java.util.Date;

public class HibernateApplication {

    public static void main(String[] args) {
        System.out.println("Hibernate + Oracle");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        DatabaseUser user = new DatabaseUser();

        user.setUsername("supermanas");
        user.setCreatedBy("systemas");
        user.setCreatedDate(new Date());

        session.save(user);
        session.getTransaction().commit();

        HibernateUtil.shutdown();
    }
}

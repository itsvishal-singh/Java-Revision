package com.vishal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
//        *********** For Inserting Data ***********
//        Alien a1 = new Alien();
//        a1.setAid(107);
//        a1.setAname("Aman kumar");
//        a1.setPoints(50);
//        Configuration configuration = new Configuration();
//        configuration.addAnnotatedClass(com.vishal.Alien.class);
//        configuration.configure();
//        configuration.configure("hibernate1.cfg.xml"); //if diff. from hibernate.cfg.xml then mention otherwise it is default
//        SessionFactory sessionFactory = configuration.buildSessionFactory();

//        ********** For Updating Data ***********
//        Alien a1 = new Alien();
//        a1.setAid(107);
//        a1.setAname("Aman Raj");
//        a1.setPoints(59);

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(com.vishal.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

//        ********** For Inserting Data ***********
//        Transaction transaction = session.beginTransaction();
//        session.persist(a1);
//        transaction.commit();

//        ********** For Fetching data ***********
//        Eager Fetching
//        Alien a1 = session.get(Alien.class, 103); // in version 6
//        Alien a1 = session.find(Alien.class, 103); // in version 7
//        Lazy fetching
//        Alien a1 = session.byId(Alien.class).getReference(103);
//        System.out.println(a1.getAid() + " : " + a1.getAname());

//        ********** For Updating Data ***********
//        Transaction transaction = session.beginTransaction();
//        session.merge(a1);
//        transaction.commit();

//        ************** For Deleting Data  ***********
        Transaction transaction = session.beginTransaction();
        // Alien a1 = session.get(Alien.class, 106);
        Alien a1 = session.find(Alien.class, 105);
        session.remove(a1);
        transaction.commit();


        sessionFactory.close();
        session.close();
    }
}
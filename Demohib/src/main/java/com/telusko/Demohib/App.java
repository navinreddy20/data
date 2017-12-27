package com.telusko.Demohib;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

// Hibernate tool -> ORM
public class App 
{
    public static void main( String[] args )
    {
    	
    	Laptop lap = new Laptop();
    	lap.setLid(101);
    	lap.setLname("Dell");
    	lap.setPrice(1200);
    	
    	Laptop lap1 = new Laptop();
    	lap1.setLid(102);
    	lap1.setLname("Asus");
    	lap1.setPrice(1300);
    	
    	List<Laptop> laps = new ArrayList<>();
    	laps.add(lap);
    	laps.add(lap1);
    	
    	Alien a = new Alien();
    	a.setAid(1);
    	a.setAname("Suman");
    	a.setLaptops(laps);
    	
    	
    	
    	SessionFactory sf = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction t = session.getTransaction();
    	
    	t.begin();
    	session.save(lap);
    	session.save(lap1);
    	session.save(a);
    	
    	t.commit();
    	System.out.println(a);
    	
    	session.close();
    }
}

package com.telusko.Demohib.inhe;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

// HCL -> Hibernate Criteria Language or HQL -> Hibernate Query Language 
// SQL in Hibernate -> Native Query


// class -> entity -> Table

// select * from computer;
// SQL in Hibernate, NamedQuery


public class App {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Computer.class).buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction t = session.getTransaction();
  
    	t.begin();
    	
    	int id = 45;
    	
    	Query<Computer> q1 = session.createQuery("from Computer order by ram desc");
    	
    	List<Computer> coms = q1.list();
    	for(Computer com : coms)
    	{    	
    		System.out.println(com);
    	}
    	t.commit();
	}
}

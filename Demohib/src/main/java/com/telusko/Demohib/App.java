package com.telusko.Demohib;


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
        
//    	Alien a = new Alien();
//    	a.setAid(3);
//    	a.setAname("Mani");
//    	a.setTech("ML");
    	// Factory , abstractfactory, builder, deco, observer, singleton
    	
    	SessionFactory sf = new Configuration().configure().addAnnotatedClass(Alien.class).buildSessionFactory();
    	
    	Session session = sf.openSession();
    //	Transaction t = session.getTransaction();
    	
    //	t.begin();
    	Alien a = session.get(Alien.class, 3);
   // 	t.commit();
    	System.out.println(a);
    }
}

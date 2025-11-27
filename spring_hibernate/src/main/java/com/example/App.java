package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        One obj=new One();
        obj.setName("tushar");
        obj.setPass("6969");
        
        Configuration configuration= new Configuration();
        configuration.configure("com/example/hibernate.cfg.xml");
        
        
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(obj);
		transaction.commit();
		
        
    }
}

package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        System.out.println( "Welcome to DB" );
        // SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();


        Session session = factory.openSession();


        Transaction tx = session.beginTransaction();


//       Query query = session.createQuery("select min(age) from Student");
//      // query.setInteger("age", 23);
//      List<Student> studList=query.list();

        Query q=session.createQuery("update Student set name=:n where id=:i");
        q.setParameter("n","Udit Kumar");
        q.setParameter("i",1);
        int status =  q.executeUpdate();
        System.out.println(status);

//       for(Student st : studList)
//       {
//    	   System.out.println(st);
//       }


        tx.commit();
        session.close();
    }
}

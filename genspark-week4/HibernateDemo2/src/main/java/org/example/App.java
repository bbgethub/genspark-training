package org.example;

import org.example.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

//        Employee e1=new Employee();
//        e1.setEmpId(2);
//        e1.setEmpName("Sukvinder");
//        e1.setEmpDept("Training Dept");
//        session.save(e1);

//        Query query = session.createQuery("from Employee where empDept=:dept");
//        query.setParameter("dept","HR Dept");
//        List<Employee> empList=query.list();
//
//        for(Employee emp : empList)
//       {
//    	   System.out.println(emp.toString());
//       }
        Query q=session.createQuery("update Employee set empName=:n where empId=:i");
        q.setParameter("n","Adam");
        q.setParameter("i",1);
        int status =  q.executeUpdate();
        System.out.println(status);
        t.commit();
        System.out.println("Updated Successfully");
        factory.close();
        session.close();
    }

}

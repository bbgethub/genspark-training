package org.genspark.dao;

import org.genspark.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class PersonDAOImpl implements PersonDAO{

    private SessionFactory sessionFactory;
    public void  setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory=sessionFactory;
    }
    @Override
    public void save(Person person) {
        Session session=this.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.persist(person);
        tx.commit();
        session.close();

    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Person> list() {
        Session session=this.sessionFactory.openSession();
        List<Person> personList=session.createQuery("from Person").list();
        session.close();
        return personList;
    }
}

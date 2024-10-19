package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Persons
{
    Persons()
    {

    }



    public void addPerson(Person person)
    {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()){


            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
        }catch (Exception e)
        {
            e.printStackTrace();

        }

    }

    public void deletePerson(Person person)
    {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();){


            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.delete(person);
            session.getTransaction().commit();
        }catch (Exception e)
        {
            e.printStackTrace();

        }

    }

    public void updatePerson(Person person,String name,int age)
    {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();){


            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            person.setName(name);
            person.setAge(age);
            session.update(person);
            session.getTransaction().commit();

        }catch (Exception e)
        {
            e.printStackTrace();

        }
    }
    public Person getPerson(Person person)
    {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();){


            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            return session.get(Person.class,person.getId());

        }catch (Exception e)
        {
            e.printStackTrace();
            return null;

        }

    }

    public Person getPerson(int id)
    {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();){


            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            return session.get(Person.class,id);

        }catch (Exception e)
        {
            e.printStackTrace();
            return null;

        }

    }


}

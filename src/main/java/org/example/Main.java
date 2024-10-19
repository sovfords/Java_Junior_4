package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)
    {
        Person person1 = new Person("Peter",29);
        Person person2 = new Person("Elena",23);
        Person person3 = new Person("Alex",18);

        Persons persons = new Persons();

        persons.addPerson(person1);
        persons.addPerson(person2);
        persons.addPerson(person3);

        persons.deletePerson(person1);
        persons.updatePerson(person2,"Maria",21);
        System.out.println(persons.getPerson(person3));
        System.out.println(persons.getPerson(1));



    }
}
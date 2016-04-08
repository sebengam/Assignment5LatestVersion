package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Person;

/**
 * Created by student on 2016/04/03.
 */
public class PersonFactory
{
    public static Person getPerson(String IDNumber,String name, String surname)
    {
        Person myPerson = new Person.Builder(IDNumber)
                .name(name)
                .surname(surname)
                .build();
        return myPerson;

    }
}

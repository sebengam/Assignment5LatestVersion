package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Person;
import za.ac.cput.assignment5.Factory.PersonFactory;

/**
 * Created by student on 2016/04/03.
 */
public class PersonTest
{
    private Person person;

    @Before
    public void setUp() throws Exception
    {

        person = PersonFactory.getPerson("8503125889087","Tankiso", "Sebenga");
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(person.getIDNumber(),"8503125889087");
        Assert.assertEquals(person.getName(), "Tankiso");
        Assert.assertEquals(person.getSurname(), "Sebenga");


    }

    @Test
    public void testNewUpdate() throws Exception {
        Person personUpdate = new Person.Builder(person.getIDNumber())
                .copy(person)
                .name("Tankiso")
                .surname("Sebenga")
                .build();
        Assert.assertEquals(personUpdate.getIDNumber(),"8503125889087");
        Assert.assertEquals(personUpdate.getName(), "Tankiso");
        Assert.assertEquals(personUpdate.getSurname(), "Sebenga");

    }

}

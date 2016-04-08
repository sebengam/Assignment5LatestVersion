package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Gynecologist;
import za.ac.cput.assignment5.Factory.GynecologistFactory;

/**
 * Created by student on 2016/04/05.
 */
public class GynecologistTest
{ private Gynecologist gynecologist;

    @Before
    public void setUp() throws Exception
    {

        gynecologist = GynecologistFactory.getGynecologist(true,2016/4/3, 800f);
    }

    @Test
    public void testAdvocate() throws Exception
    {
        Assert.assertEquals(gynecologist.getAvailability(),true);
        Assert.assertEquals(gynecologist.getCalender(),2016/4/3);
        Assert.assertEquals(gynecologist.getRatePerHour(),1,800f);



    }

    @Test
    public void testNewUpdate() throws Exception {
        Gynecologist gynecologistUpdate = new Gynecologist.Builder(gynecologist.getAvailability())
                .copy(gynecologist)
                .calender(2016/4/3)
                .ratePerHour(800f)
                .build();
        Assert.assertEquals(gynecologistUpdate.getAvailability(),true);
        Assert.assertEquals(gynecologistUpdate.getCalender(), 2016/4/3);
        Assert.assertEquals(gynecologistUpdate.getRatePerHour(),1,800f);
    }

}

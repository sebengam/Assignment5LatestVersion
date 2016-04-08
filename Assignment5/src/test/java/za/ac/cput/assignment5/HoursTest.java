package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Hours;
import za.ac.cput.assignment5.Factory.HoursFactory;

/**
 * Created by student on 2016/04/03.
 */
public class HoursTest
{
    private Hours hours;

    @Before
    public void setUp() throws Exception
    {

        hours = HoursFactory.getHours(58,36);
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(hours.getHoursBooked(),58);
        Assert.assertEquals(hours.getHoursWorked(),36);

    }

    @Test
    public void testNewUpdate() throws Exception {
        Hours hoursUpdate = new Hours.Builder(hours.getHoursBooked())
                .copy(hours)
                .hoursWorked(36)
                .build();
        Assert.assertEquals(hoursUpdate.getHoursBooked(),58);
        Assert.assertEquals(hoursUpdate.getHoursWorked(),36);

    }
}

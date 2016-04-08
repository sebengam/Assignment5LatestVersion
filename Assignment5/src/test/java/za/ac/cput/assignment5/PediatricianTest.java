package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Pediatrician;
import za.ac.cput.assignment5.Factory.PediatricianFactory;

/**
 * Created by student on 2016/04/05.
 */
public class PediatricianTest 
{
    private Pediatrician pediatrician;

    @Before
    public void setUp() throws Exception
    {

        pediatrician = PediatricianFactory.getPediatrician(true,2016/4/3, 900f);
    }

    @Test
    public void testAdvocate() throws Exception
    {
        Assert.assertEquals(pediatrician.getAvailability(),true);
        Assert.assertEquals(pediatrician.getCalender(),2016/4/3);
        Assert.assertEquals(pediatrician.getRatePerHour(),1,900f);



    }

    @Test
    public void testNewUpdate() throws Exception {
        Pediatrician pediatricianUpdate = new Pediatrician.Builder(pediatrician.getAvailability())
                .copy(pediatrician)
                .calender(2016/4/3)
                .ratePerHour(900f)
                .build();
        Assert.assertEquals(pediatricianUpdate.getAvailability(),true);
        Assert.assertEquals(pediatricianUpdate.getCalender(), 2016/4/3);
        Assert.assertEquals(pediatricianUpdate.getCalender(),1, 900f);
    }
    
}

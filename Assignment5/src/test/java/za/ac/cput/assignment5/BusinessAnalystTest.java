package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.BusinessAnalyst;
import za.ac.cput.assignment5.Factory.BusinessAnalystFactory;

/**
 * Created by student on 2016/04/05.
 */
public class BusinessAnalystTest
{
    private BusinessAnalyst businessAnalyst;
    private float ratePerHour;

    @Before
    public void setUp() throws Exception
    {

        businessAnalyst = BusinessAnalystFactory.getBusinessAnalyst(true,2016/4/3,500f);
    }

    @Test
    public void testAdvocate() throws Exception
    {
        Assert.assertEquals(businessAnalyst.getAvailability(),true);
        Assert.assertEquals(businessAnalyst.getCalender(),2016/4/3);
        Assert.assertEquals(businessAnalyst.getRatePerHour(),1,500);


    }

    @Test
    public void testNewUpdate() throws Exception {
        BusinessAnalyst businessAnalystUpdate = new BusinessAnalyst.Builder(businessAnalyst.getAvailability())
                .copy(businessAnalyst)
                .calender(2016/4/3)
                .ratePerHour(ratePerHour)
                .build();

        Assert.assertEquals(businessAnalystUpdate.getAvailability(),true);
        Assert.assertEquals(businessAnalystUpdate.getCalender(), 2016/4/3);
        Assert.assertEquals(businessAnalyst.getRatePerHour(),1,500);

    }
}

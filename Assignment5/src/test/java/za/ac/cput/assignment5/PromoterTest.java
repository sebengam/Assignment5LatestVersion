package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Promoter;
import za.ac.cput.assignment5.Factory.PromoterFactory;

/**
 * Created by student on 2016/04/05.
 */
public class PromoterTest
{
    private Promoter promoter;

    @Before
    public void setUp() throws Exception
    {

        promoter = PromoterFactory.getPromoter(true,2016/4/3,1000);
    }

    @Test
    public void testAdvocate() throws Exception
    {
        Assert.assertEquals(promoter.getAvailability(),true);
        Assert.assertEquals(promoter.getCalender(),2016/4/3);
        Assert.assertEquals(promoter.getRatePerHour(),1,1000);



    }

    @Test
    public void testNewUpdate() throws Exception {
        Promoter promoterUpdate = new Promoter.Builder(promoter.getAvailability())
                .copy(promoter)
                .calender(2016/4/3)
                .ratePerHour(1000f)
                .build();
        Assert.assertEquals(promoterUpdate.getAvailability(),true);
        Assert.assertEquals(promoterUpdate.getCalender(), 2016/4/3);
        Assert.assertEquals(promoterUpdate.getRatePerHour(),1,1000f);
    }
}

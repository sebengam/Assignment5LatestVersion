package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Developer;
import za.ac.cput.assignment5.Factory.DeveloperFactory;

/**
 * Created by student on 2016/04/05.
 */
public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp() throws Exception {

        developer = DeveloperFactory.getDeveloper(true, 2016 / 4 / 3,500f);
    }

    @Test
    public void testAdvocate() throws Exception {
        Assert.assertEquals(developer.getAvailability(), true);
        Assert.assertEquals(developer.getCalender(), 2016 / 4 / 3);
        Assert.assertEquals(developer.getRatePerHour(),1,500f);

    }

    @Test
    public void testNewUpdate() throws Exception {
        Developer developerUpdate = new Developer.Builder(developer.getAvailability())
                .copy(developer)
                .calender(2016 / 4 / 3)
                .ratePerHour(500f)
                .build();
        Assert.assertEquals(developerUpdate.getAvailability(), true);
        Assert.assertEquals(developerUpdate.getCalender(), 2016 / 4 / 3);
        Assert.assertEquals(developerUpdate.getRatePerHour(),1,500);

    }
}

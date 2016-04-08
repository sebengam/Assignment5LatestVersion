package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Attorney;
import za.ac.cput.assignment5.Factory.AttorneyFactory;

/**
 * Created by student on 2016/04/03.
 */
public class AttorneyTest {
    private Attorney attorney;

    @Before
    public void setUp() throws Exception {

        attorney = AttorneyFactory.getAttorney(true, 2016 / 4 / 3,500f);
    }

    @Test
    public void testAdvocate() throws Exception {
        Assert.assertEquals(attorney.getAvailability(), true);
        Assert.assertEquals(attorney.getCalender(), 2016 / 4 / 3);
        Assert.assertEquals(attorney.getRatePerHour(),1,500f);
    }

        @Test
        public void testNewUpdate()throws Exception {
            Attorney attorneyUpdate = new Attorney.Builder(attorney.getAvailability())
                    .copy(attorney)
                    .calender(2016 / 4 / 3)
                    //.ratePerHour(ratePerHour)
                    .build();
            Assert.assertEquals(attorneyUpdate.getAvailability(), true);
            Assert.assertEquals(attorneyUpdate.getCalender(), 2016 / 4 / 3);
            Assert.assertEquals(attorneyUpdate.getCalender(),1,500f);
        }
    }


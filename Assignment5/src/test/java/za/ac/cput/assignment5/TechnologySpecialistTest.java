package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.TechnologySpecialist;
import za.ac.cput.assignment5.Factory.TechnologySpecialistFactory;

/**
 * Created by student on 2016/04/05.
 */
public class TechnologySpecialistTest
{
    private TechnologySpecialist technologySpecialist;

    @Before
    public void setUp() throws Exception
    {

        technologySpecialist = TechnologySpecialistFactory.getTechnologySpecialist("Developer");
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(technologySpecialist.getOccupation(),"Developer");

    }

    @Test
    public void testNewUpdate() throws Exception {
        TechnologySpecialist technologySpecialistUpdate = new TechnologySpecialist.Builder(technologySpecialist.getOccupation())
                .copy(technologySpecialist)
                .build();
        Assert.assertEquals(technologySpecialistUpdate.getOccupation(),"Developer");

    }


}

package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Fmcg;
import za.ac.cput.assignment5.Factory.FmcgFactory;

/**
 * Created by student on 2016/04/05.
 */
public class FmcgTest
{
    private Fmcg fmcg;

    @Before
    public void setUp() throws Exception
    {

        fmcg = FmcgFactory.getFcmg("Advocate");
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(fmcg.getOccupation(),"Advocate");

    }

    @Test
    public void testNewUpdate() throws Exception {
        Fmcg doctorUpdate = new Fmcg.Builder(fmcg.getOccupation())
                .copy(fmcg)
                .build();
        Assert.assertEquals(doctorUpdate.getOccupation(),"Advocate");
    }
}

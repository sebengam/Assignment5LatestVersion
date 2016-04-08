package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Company;
import za.ac.cput.assignment5.Factory.CompanyFactory;

/**
 * Created by student on 2016/04/03.
 */
public class CompanyTest
{

    private Company company;

    @Before
    public void setUp() throws Exception
    {

        company = CompanyFactory.getCompany("CPUT","88856");
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(company.getRegNumber(),"88856");
        Assert.assertEquals(company.getCompanyName(),"CPUT");



    }

    @Test
    public void testNewUpdate() throws Exception {
        Company companyUpdate = new Company.Builder(company.getRegNumber())
                .copy(company)
                .companyName("CPUT")
                .build();
        Assert.assertEquals(companyUpdate.getRegNumber(),"88856");
        Assert.assertEquals(companyUpdate.getCompanyName(), "CPUT");

    }
}

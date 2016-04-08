package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Company;

/**
 * Created by student on 2016/04/03.
 */
public class CompanyFactory
{ public static Company getCompany(String companyName,String regNumber)
    {
        Company myCompany = new Company.Builder(regNumber)
                .companyName(companyName)
                .build();
        return myCompany;

    }


}

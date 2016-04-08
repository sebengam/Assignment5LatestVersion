package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Advocate;

/**
 * Created by student on 2016/04/03.
 */
public class AdvocateFactory
{
    public static Advocate getAdvocate(boolean availability, int calender,float ratePerHour)
    {
        Advocate myCompany = new Advocate.Builder(availability)
                .ratePerHour(ratePerHour)
                .calender(calender)
                .ratePerHour(ratePerHour)
                .build();
        return myCompany;

    }

}

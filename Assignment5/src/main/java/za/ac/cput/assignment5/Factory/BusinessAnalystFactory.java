package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.BusinessAnalyst;

/**
 * Created by student on 2016/04/07.
 */
public class BusinessAnalystFactory
{

    public static BusinessAnalyst getBusinessAnalyst(boolean availability, int calender, float ratePerHour)
    {
        BusinessAnalyst myBusinessAnalyst = new BusinessAnalyst.Builder(availability)
                .ratePerHour(ratePerHour)
                .calender(calender)
                .ratePerHour(ratePerHour)
                .build();
        return myBusinessAnalyst;

    }

}

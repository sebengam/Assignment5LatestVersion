package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Attorney;

/**
 * Created by student on 2016/04/03.
 */
public class AttorneyFactory
{
    public static Attorney getAttorney(boolean availability, int calender,float ratePerHour)
    {
        Attorney myAttorney = new Attorney.Builder(availability)
                .calender(calender)
                .ratePerHour(ratePerHour)
                .build();
        return myAttorney;

    }
}

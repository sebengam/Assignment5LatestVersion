package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Developer;

/**
 * Created by student on 2016/04/05.
 */
public class DeveloperFactory
{
    public static Developer getDeveloper(boolean availability, int calender,float ratePerHour)
    {
        Developer myDeveloper = new Developer.Builder(availability)
                .calender(calender)
                .ratePerHour(ratePerHour)
                .build();
        return myDeveloper;

    }
}

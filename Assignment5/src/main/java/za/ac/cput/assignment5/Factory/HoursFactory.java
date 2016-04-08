package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Hours;

/**
 * Created by student on 2016/04/03.
 */
public class HoursFactory
{
    public static Hours getHours(int hoursBooked,int hoursWorked)
    {
        Hours myHours = new Hours.Builder(hoursBooked)
                .hoursWorked(hoursWorked)
                .build();
        return myHours;
    }
}

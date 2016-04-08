package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Pediatrician;

/**
 * Created by student on 2016/04/05.
 */
public class PediatricianFactory
{
    public static Pediatrician getPediatrician(boolean availability, int calender, float ratePerHour)
    {
        Pediatrician myPediatrician = new Pediatrician.Builder(availability)
                .calender(calender)
                .ratePerHour(ratePerHour)
                .build();
        return myPediatrician;

    }
}

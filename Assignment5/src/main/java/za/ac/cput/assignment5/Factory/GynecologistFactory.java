package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Gynecologist;

/**
 * Created by student on 2016/04/05.
 */
public class GynecologistFactory
{
    public static Gynecologist getGynecologist(boolean availability, int calender, float ratePerHour)
    {
        Gynecologist myGynecologist = new Gynecologist.Builder(availability)
                .calender(calender)
                .ratePerHour(ratePerHour)
                .build();
        return myGynecologist;

    }
}

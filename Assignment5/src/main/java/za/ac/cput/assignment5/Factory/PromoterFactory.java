package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Promoter;

/**
 * Created by student on 2016/04/05.
 */
public class PromoterFactory
{
    public static Promoter getPromoter(boolean availability, int calender, float ratePerHour)
    {

        Promoter myPromoter = new Promoter.Builder(availability)
                .calender(calender)
                .ratePerHour(ratePerHour)
                .build();
        return myPromoter;

    }
}

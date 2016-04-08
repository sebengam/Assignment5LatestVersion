package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Fmcg;

/**
 * Created by student on 2016/04/05.
 */
public class FmcgFactory
{
    public static Fmcg getFcmg(String occupation)
    {
        Fmcg myFmcg = new Fmcg.Builder(occupation)
                .build();
        return myFmcg;

    }
}

package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.TechnologySpecialist;

/**
 * Created by student on 2016/04/04.
 */
public class TechnologySpecialistFactory
{
    public static TechnologySpecialist getTechnologySpecialist(String occupation)
    {
        TechnologySpecialist myTechnologySpecialist = new TechnologySpecialist.Builder(occupation)
                .build();
        return myTechnologySpecialist;

    }
}

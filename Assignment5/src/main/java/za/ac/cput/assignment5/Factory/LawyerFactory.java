package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Lawyer;

/**
 * Created by student on 2016/04/03.
 */
public class LawyerFactory
{
    public static Lawyer getLawyer(String occupation)
    {
        Lawyer myLawyer = new Lawyer.Builder(occupation)
                .build();
        return myLawyer;

    }

}

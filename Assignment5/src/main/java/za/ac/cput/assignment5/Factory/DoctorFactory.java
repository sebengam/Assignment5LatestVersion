package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Doctor;

/**
 * Created by student on 2016/04/05.
 */
public class DoctorFactory
{

    public static Doctor getDoctor(String occupation)
    {
        Doctor myDoctor = new Doctor.Builder(occupation)
                .build();
        return myDoctor;

    }

}

package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Doctor;
import za.ac.cput.assignment5.Factory.DoctorFactory;

/**
 * Created by student on 2016/04/05.
 */
public class DoctorTest
{
    private Doctor doctor;

    @Before
    public void setUp() throws Exception
    {

        doctor = DoctorFactory.getDoctor("Advocate");
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(doctor.getOccupation(),"Advocate");



    }

    @Test
    public void testNewUpdate() throws Exception {
        Doctor doctorUpdate = new Doctor.Builder(doctor.getOccupation())
                .copy(doctor)
                .build();
        Assert.assertEquals(doctorUpdate.getOccupation(),"Advocate");

    }
}

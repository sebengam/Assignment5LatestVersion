package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Administrator;
import za.ac.cput.assignment5.Domain.Booking;

/**
 * Created by student on 2016/04/03.
 */
public class AdministratorFactory {

    public static Administrator getAdministrator(String staffNumber, boolean booking, float totalWage) {
        Administrator myAdministrator = new Administrator.Builder(staffNumber)
                .booking(booking)
                .totalWage(totalWage)
                .build();
        return myAdministrator;

    }
}

package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Booking;
import za.ac.cput.assignment5.Domain.Company;
import za.ac.cput.assignment5.Domain.Person;

/**
 * Created by student on 2016/04/05.
 */
public class BookingFactory
{
    public static Booking getBooking(Boolean availability, String bookingCompany, String bookingPerson)
    {
        Booking myBooking = new Booking.Builder(availability)
                .bookingCompany(bookingCompany)
                .bookingPerson(bookingPerson)
                .build();
        return myBooking;

    }

}

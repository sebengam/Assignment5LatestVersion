package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Booking;
import za.ac.cput.assignment5.Factory.BookingFactory;

/**
 * Created by student on 2016/04/05.
 */
public class BookingTest
{

    private Booking booking;

    @Before
    public void setUp() throws Exception
    {

        booking = BookingFactory.getBooking(true, "CPUT", "Tankiso");
    }

    @Test
    public void testAdvocate() throws Exception
    {
        Assert.assertEquals(booking.getAvailability(),true);
        Assert.assertEquals(booking.getBookingCompany(),"CPUT");
        Assert.assertEquals(booking.getBookedPerson(),"Tankiso");
    }

    @Test
    public void testNewUpdate() throws Exception {
        Booking bookingUpdate = new Booking.Builder(booking.getAvailability())
                .copy(booking)
                .bookingCompany("CPUT")
                .bookingPerson("Tankiso")
                .build();
        Assert.assertEquals(bookingUpdate.getAvailability(),true);
        Assert.assertEquals(bookingUpdate.getBookingCompany(),"CPUT");
        Assert.assertEquals(bookingUpdate.getBookedPerson(),"Tankiso");


    }
}
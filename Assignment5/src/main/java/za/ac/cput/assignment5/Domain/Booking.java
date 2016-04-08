package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public class Booking
{
    private Boolean availability;
    String bookedPerson;
    String bookingCompany;

    public Booking (Builder builder)
    {
        availability = builder.availability;
        bookedPerson = builder.bookingPerson;
        bookingCompany = builder. bookingCompany;

    }

    public String getBookedPerson() {
        return bookedPerson;
    }

    public String getBookingCompany() {
        return bookingCompany;
    }

    public Boolean getAvailability() {
        return availability;
    }


    public static class Builder
    {
        private Boolean availability;
        String bookingPerson;
        String bookingCompany;

        public Builder (boolean availability)
        {
            this.availability = availability;
        }

        public Builder bookingPerson(String bookingPerson)
        {
            this.bookingPerson =  bookingPerson;
            return this;
        }

        public Builder bookingCompany(String bookingCompany)
        {
            this.bookingCompany = bookingCompany;
            return this;
        }

        public Builder copy(Booking booking)
        {
            this.availability = booking.getAvailability();
            this.bookingCompany = String.valueOf(booking.getBookingCompany());
            this.bookingPerson = booking.getBookedPerson();


            return this;
        }

        public Booking build()
        {
            return new Booking(this);
        }

    }
}

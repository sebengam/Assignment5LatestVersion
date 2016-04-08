package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public abstract class Advocate extends Lawyer
{
    boolean availability;
    int calender;
    float ratePerHour;

    public boolean isAvailability() {
        return availability;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public Advocate(Builder builder)
    {
        super();
        availability = builder.availability;
        calender = builder.calender;
        ratePerHour = builder.ratePerHour;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public int getCalender() {
        return calender;
    }
    public static class Builder
    {

        private boolean availability;
        public int calender;
        public float ratePerHour;

        public Builder (boolean availability)
        {
            this.availability = availability;
        }

        public Builder calender(int calender)
        {
            this.calender = calender;
            return this;
        }

        public Builder ratePerHour(float ratePerHour)
        {
            this.ratePerHour = ratePerHour;
            return this;
        }

        public Builder copy(Advocate advocate)
        {
            this.availability = advocate.getAvailability();
            this.calender = advocate.getCalender();
            this.ratePerHour = advocate.getRatePerHour();
            return this;
        }

        public Advocate build ()
        {
            return new Advocate(this) {
                @Override
                public int totalHours() {
                    return 0;
                }
            };
        }
    }


}

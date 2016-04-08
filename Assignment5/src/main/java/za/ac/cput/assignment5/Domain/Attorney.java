package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public abstract class Attorney extends Lawyer
{
    boolean availability;
    int calender;
    float ratePerHour;


    public Attorney(Builder builder)
    {
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

    public float getRatePerHour() {
        return ratePerHour;
    }

    public static class Builder
    {

        private boolean availability;
        public int calender;
        float ratePerHour;

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

        public Builder copy(Attorney attorney)
        {
            this.availability = attorney.getAvailability();
            this.calender = attorney.getCalender();
            this.ratePerHour = attorney.getRatePerHour();
            return this;
        }

        public Attorney build ()
        {
            return new Attorney(this) {
                @Override
                public int totalHours() {
                    return 0;
                }
            };
        }
    }


}

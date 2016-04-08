package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/05.
 */
public abstract class Gynecologist extends Doctor
{
    boolean availability;
    int calender;
    static float ratePerHour;

    public Gynecologist(Builder builder)
    {
        super();
        availability = builder.availability;
        calender = builder.calender;
        ratePerHour = builder.ratePerHour;

    }



    public float getRatePerHour() {
        return ratePerHour;
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
        public Builder copy(Gynecologist gynecologist)
        {
            this.availability = gynecologist.getAvailability();
            this.calender = gynecologist.getCalender();
            this.ratePerHour = gynecologist.getRatePerHour();
            return this;
        }

        public Gynecologist build ()
        {
            return new Gynecologist(this) {
                @Override
                public int totalHours() {
                    return 0;
                }
            };
        }
    }
}

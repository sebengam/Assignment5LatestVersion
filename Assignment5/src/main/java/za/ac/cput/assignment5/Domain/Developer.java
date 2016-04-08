package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/05.
 */
public abstract class Developer extends TechnologySpecialist
{
    boolean availability;
    int calender;
    float ratePerHour;

    public Developer(Builder builder)
    {
        availability = builder.availability;
        calender = builder.calender;
        ratePerHour = builder.ratePerHour;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public float getRatePerHour() {
        return ratePerHour;
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

        public Builder copy(Developer developer)
        {
            this.availability = developer.getAvailability();
            this.calender = developer.getCalender();
            this.ratePerHour = developer.ratePerHour;
            return this;
        }

        public Developer build ()
        {
            return new Developer(this) {
                @Override
                public int totalHours() {
                    return 0;
                }
            };
        }
    }
}

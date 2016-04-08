package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/05.
 */
public abstract class Pediatrician extends Doctor
{

    boolean availability;
    int calender;
    float ratePerHour;

    public Pediatrician(Builder builder)
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
    public static class Builder
    {

        private boolean availability;
        public int calender;
        public  float ratePerHour;

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
        public Builder copy(Pediatrician pediatrician)
        {
            this.availability = pediatrician.getAvailability();
            this.calender = pediatrician.getCalender();
            this.ratePerHour = pediatrician.getRatePerHour();
            return this;
        }

        public Pediatrician build ()
        {
            return new Pediatrician(this) {
                @Override
                public int totalHours() {
                    return 0;
                }

                @Override
                public float getRatePerHour() {
                    return 0;
                }
            };
        }
    }
}

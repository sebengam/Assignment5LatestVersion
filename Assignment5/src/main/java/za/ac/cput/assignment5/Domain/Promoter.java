package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/05.
 */
public abstract class Promoter extends Fmcg
{
    boolean availability;
    int calender;
    float ratePerHour;

    public Promoter(Builder builder)
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
    public static class Builder {

        private boolean availability;
        public int calender;
        public float ratePerHour;

        public Builder(boolean availability) {
            this.availability = availability;
        }

        public Builder calender(int calender) {
            this.calender = calender;
            return this;
        }

        public Builder ratePerHour(float ratePerHour)
        {
            this.ratePerHour = ratePerHour;
            return this;
        }


        public Builder copy(Promoter promoter)
        {
            this.availability = promoter.getAvailability();
            this.calender = promoter.getCalender();
            this.ratePerHour = promoter.getRatePerHour();
            return this;
        }

        public Promoter build ()
        {
            return new Promoter(this) {
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

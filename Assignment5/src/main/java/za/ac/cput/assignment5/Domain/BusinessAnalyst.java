package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/05.
 */
public abstract class BusinessAnalyst extends TechnologySpecialist
{
    boolean availability;
    int calender;
    float ratePerHour;

    public BusinessAnalyst(Builder builder)
    {
        super();
        availability = builder.availability;
        calender = builder.calender;
        ratePerHour = builder.ratePerHour;
    }
    

    public Boolean getAvailability() {
        return availability;
    }

    @Override
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

        public Builder copy(BusinessAnalyst businessAnalyst)
        {
            this.availability = businessAnalyst.getAvailability();
            this.calender = businessAnalyst.getCalender();
            this.ratePerHour = businessAnalyst.getRatePerHour();
            return this;
        }

        public BusinessAnalyst build () {
            return new BusinessAnalyst(this) {
                @Override
                public int totalHours() {
                    return 0;
                }
            };
        }

    }
}

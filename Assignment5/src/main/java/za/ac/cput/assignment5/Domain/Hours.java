package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public abstract class Hours extends Company
{
    int hoursBooked;
    int hoursWorked;
    int totalHours;

    public Hours(Builder builder)
    {
        super();
        hoursBooked = builder.hoursBooked;
        hoursWorked = builder.hoursWorked;
        totalHours = builder.totalHours;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getHoursBooked() {
        return hoursBooked;
    }

    public int totalHours(int totalHours)
    {
        totalHours = getHoursBooked() - getHoursWorked();

        return totalHours;
    }

    public static class Builder
    {
        public int hoursBooked;
        public int hoursWorked;
        public int totalHours;

        public Builder(int hoursBooked)
        {
            this.hoursBooked = hoursBooked;
        }

        public Builder hoursWorked(int hoursWorked)
        {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder copy(Hours hours)
        {
            this.hoursBooked = hours.getHoursBooked();
            this.hoursWorked = hours.getHoursWorked();

            return this;
        }

        public Hours build ()
        {
            return new Hours(this) {
                public float totalWages() {
                    return 0;
                }

                @Override
                public int totalHours() {
                    return getHoursWorked()- getHoursBooked();
                }

                @Override
                public float getRatePerHour() {
                    return 0;
                }

                public double getTotalWages() {
                    return 0;
                }
            };
        }
    }
}

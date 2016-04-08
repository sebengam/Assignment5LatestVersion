package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public abstract class Administrator
{
    public boolean booking;
    String staffNumber;
    float totalWage;
    public abstract int totalHours();
    public abstract float getRatePerHour();

    public Administrator (Builder builder)
    {
        booking = builder.booking;
        staffNumber = builder.staffNumber;
        totalWage = builder.totalWage;
    }

    public Administrator() {

    }

    public Boolean getBooking() {

        return booking;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public float totalWage() {

        totalWage = totalHours()*getRatePerHour();
        return totalWage;
    }

    public static class Builder
    {
        boolean booking;
        String staffNumber;
        float totalWage;

        public Builder(String staffNumber)
        {
            this.staffNumber = staffNumber;
        }

        public Builder booking(boolean booking)
        {
            this.booking = booking;
            return this;
        }

        public Builder totalWage(float totalWage)
        {
            this.totalWage = totalWage;
            return this;
        }
        public Builder copy(Administrator administrator)
        {
            this.staffNumber = administrator.getStaffNumber();
            this.booking = administrator.booking;
            this.totalWage = administrator.totalWage();

            return this;
        }


        public Administrator build()
        {
            return new Administrator(this) {
                public float totalWages() {
                    return 0;
                }

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

package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/05.
 */
public abstract class Doctor extends Person
{
    String occupation;

    public Doctor() {

    }

    public abstract float getRatePerHour();

    public Doctor(Builder builder)
    {
        occupation = builder.occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public static class Builder
    {
        private String occupation;

        public Builder(String occupation)
        {
            this.occupation = occupation;
        }

        public Builder copy(Doctor doctor)
        {
            this.occupation = doctor.getOccupation();
            return this;
        }

        public Doctor build ()
        {
            return new Doctor(this) {
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

package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public abstract class Lawyer extends Person
{
    String occupation;
    public abstract float getRatePerHour();

    public Lawyer(Builder builder)
    {
        super();
        occupation = builder.occupation;
    }

    public Lawyer() {

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


        public Builder copy(Lawyer lawyer)
        {
            this.occupation = lawyer.getOccupation();
            return this;
        }

        public Lawyer build ()
        {
            return new Lawyer(this) {
                @Override
                public float getRatePerHour() {
                    return 0;
                }

                @Override
                public int totalHours() {
                    return 0;
                }
            };
        }
    }
}

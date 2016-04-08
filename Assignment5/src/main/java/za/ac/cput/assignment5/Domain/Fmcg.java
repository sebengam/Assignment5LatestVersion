package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/05.
 */
public abstract class Fmcg extends Person
{
    String occupation;

    public Fmcg() {

    }

    public abstract float getRatePerHour();

    public Fmcg(Builder builder)
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

        public Builder copy(Fmcg fmcg)
        {
            this.occupation = fmcg.getOccupation();
            return this;
        }

        public Fmcg build ()
        {
            return new Fmcg(this) {
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

package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public abstract class TechnologySpecialist extends Person
{
    String occupation;
    public abstract float getRatePerHour();

    public TechnologySpecialist(Builder builder)
    {
        occupation = builder.occupation;
    }

    public TechnologySpecialist() {
        
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

        public TechnologySpecialist.Builder copy(TechnologySpecialist technologySpecialist)
        {
            this.occupation = technologySpecialist.getOccupation();
            return this;
        }

        public TechnologySpecialist build ()
        {
            return new TechnologySpecialist(this) {
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

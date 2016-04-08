package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public abstract class Person extends Administrator
{
    private String name;
    private String surname;
    private String IDNumber;
    public abstract float getRatePerHour();

    public Person(Builder builder)
    {
        super();
        name = builder.name;
        surname = builder.surname;
        IDNumber = builder.IDNumber;

    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIDNumber() {
        return IDNumber;
    }





    public static class Builder {

        //Equivalent to setters

        private String name;
        private String surname;
        private String IDNumber;




        public Builder (String IDNumber) {
            this.IDNumber = IDNumber; //compalsury
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder name(String name)   {
            this.name = name;
            return this;
        }





        public Builder copy(Person person)
        {
            this.IDNumber = person.getIDNumber();
            this.surname = person.getSurname();
            this.name = person.getName();

            return this;
        }

        public Person build() {
            return new Person(this) {
                public float totalWages() {
                    return totalHours()*getRatePerHour();
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

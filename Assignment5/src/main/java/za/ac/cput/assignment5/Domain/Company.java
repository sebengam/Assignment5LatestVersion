package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public abstract class Company extends Administrator
{
    private String companyName;
    private String regNumber;

    public abstract int totalHours();

    public Company(Builder builder) {
        super();
        companyName = builder.companyName;
        regNumber = builder.regNumber;


    }

    public Company() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public static class Builder
    {

        private String companyName;
        private String regNumber;

        public Builder (String regNumber){
            this.regNumber = regNumber; // compulsary
        }


        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder copy(Company company){
            this.companyName = company.getCompanyName();
            this.regNumber = company.getRegNumber();

            return this;
        }

        public Company build() {
            return new Company(this) {
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

                public double getTotalWages() {
                    return 0;
                }
            };
        }

    }

}

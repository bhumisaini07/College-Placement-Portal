package model;

public class Company {

    private String companyName;
    private double companyPackage;
    private double eligibilityCgpa;

    public Company(String companyName,
                   double companyPackage,
                   double eligibilityCgpa) {

        this.companyName = companyName;
        this.companyPackage = companyPackage;
        this.eligibilityCgpa = eligibilityCgpa;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getCompanyPackage() {
        return companyPackage;
    }

    public double getEligibilityCgpa() {
        return eligibilityCgpa;
    }
}
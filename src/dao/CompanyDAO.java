package dao;

import database.DBConnection;
import model.Company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CompanyDAO {

    public boolean addCompany(Company company) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO companies(company_name, package_lpa, eligibility_cgpa) VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(
                    1,
                    company.getCompanyName()
            );

            ps.setDouble(
                    2,
                    company.getCompanyPackage()
            );

            ps.setDouble(
                    3,
                    company.getEligibilityCgpa()
            );

            int rows =
                    ps.executeUpdate();

            return rows > 0;

        } catch(Exception e) {

            e.printStackTrace();
            return false;
        }
    }
    public ArrayList<Company> getAllCompanies() {

    ArrayList<Company> companies =
            new ArrayList<>();

    try {

        Connection con =
                DBConnection.getConnection();

        String query =
                "SELECT * FROM companies";

        PreparedStatement ps =
                con.prepareStatement(query);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            Company company =
                    new Company(
                            rs.getString("company_name"),
                            rs.getDouble("package_lpa"),
                            rs.getDouble("eligibility_cgpa")
                    );

            companies.add(company);
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return companies;
}
}
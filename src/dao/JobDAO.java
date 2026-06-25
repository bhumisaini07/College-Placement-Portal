package dao;

import database.DBConnection;
import model.Job;

import java.sql.*;
import java.util.ArrayList;

public class JobDAO {

    public ArrayList<Job> getAllJobs() {

        ArrayList<Job> jobs = new ArrayList<>();

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "SELECT * FROM jobs";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                jobs.add(
                        new Job(
                                rs.getInt("job_id"),
                                rs.getInt("company_id"),
                                rs.getString("role")
                        )
                );
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        return jobs;
    }
}

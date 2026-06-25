package dao;

import database.DBConnection;
import model.Application;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ApplicationDAO {

    public boolean applyForJob(Application app) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO applications(student_id, job_id, status) VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, app.getStudentId());
            ps.setInt(2, app.getJobId());
            ps.setString(3, app.getStatus());

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            e.printStackTrace();
            return false;
        }
    }
    public ArrayList<Application> getAllApplications() {

    ArrayList<Application> applications =
            new ArrayList<>();

    try {

        Connection con =
                DBConnection.getConnection();

        String query =
                "SELECT * FROM applications";

        PreparedStatement ps =
                con.prepareStatement(query);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            applications.add(

                    new Application(

                            rs.getInt("application_id"),

                            rs.getInt("student_id"),

                            rs.getInt("job_id"),

                            rs.getString("status")
                    )
            );
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return applications;
}
public boolean updateStatus(int applicationId,
                            String status) {

    try {

        Connection con =
                DBConnection.getConnection();

        String query =
                "UPDATE applications SET status=? WHERE application_id=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setString(1, status);

        ps.setInt(2, applicationId);

        return ps.executeUpdate() > 0;

    } catch(Exception e) {

        e.printStackTrace();

        return false;
    }
}
}
package dao;

import database.DBConnection;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    public boolean registerStudent(Student student) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO students(name,email,password,branch,cgpa,skills) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPassword());
            ps.setString(4, student.getBranch());
            ps.setDouble(5, student.getCgpa());
            ps.setString(6, student.getSkills());

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }
public boolean loginStudent(String email, String password) {

    try {

        Connection con = DBConnection.getConnection();

        String query =
                "SELECT * FROM students WHERE email=? AND password=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setString(1, email);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        return rs.next();

    } catch (Exception e) {

        e.printStackTrace();
        return false;
    }
}
}
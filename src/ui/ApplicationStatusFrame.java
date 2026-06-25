package ui;

import dao.ApplicationDAO;
import model.Application;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ApplicationStatusFrame extends JFrame {

    public ApplicationStatusFrame() {

        setTitle("Application Status");

        setSize(700, 400);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {
                "Application ID",
                "Student ID",
                "Job ID",
                "Status"
        };

        DefaultTableModel model =
                new DefaultTableModel(columns, 0);

        JTable table =
                new JTable(model);

        ApplicationDAO dao =
                new ApplicationDAO();

        ArrayList<Application> applications =
                dao.getAllApplications();

        for(Application app : applications) {

            model.addRow(
                    new Object[] {

                            app.getApplicationId(),

                            app.getStudentId(),

                            app.getJobId(),

                            app.getStatus()
                    }
            );
        }

        JScrollPane scrollPane =
                new JScrollPane(table);

        add(scrollPane);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
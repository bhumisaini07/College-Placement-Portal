package ui;

import dao.JobDAO;
import model.Job;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ViewJobsFrame extends JFrame {

    public ViewJobsFrame() {

        setTitle("Available Jobs");

        setSize(600, 400);

        String[] columns = {
                "Job ID",
                "Company ID",
                "Role"
        };

        DefaultTableModel model =
                new DefaultTableModel(columns, 0);

        JTable table =
                new JTable(model);

        JobDAO dao =
                new JobDAO();

        ArrayList<Job> jobs =
                dao.getAllJobs();

        for(Job job : jobs) {

            model.addRow(
                    new Object[] {
                            job.getJobId(),
                            job.getCompanyId(),
                            job.getRole()
                    }
            );
        }

        add(new JScrollPane(table));

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
package ui;

import dao.ApplicationDAO;
import model.Application;

import javax.swing.*;

public class ApplyJobFrame extends JFrame {

    public ApplyJobFrame() {

        setTitle("Apply For Job");

        setSize(400, 300);

        setLayout(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel studentLabel =
                new JLabel("Student ID:");

        studentLabel.setBounds(
                30,
                50,
                100,
                25
        );

        add(studentLabel);

        JTextField studentField =
                new JTextField();

        studentField.setBounds(
                150,
                50,
                150,
                25
        );

        add(studentField);

        JLabel jobLabel =
                new JLabel("Job ID:");

        jobLabel.setBounds(
                30,
                100,
                100,
                25
        );

        add(jobLabel);

        JTextField jobField =
                new JTextField();

        jobField.setBounds(
                150,
                100,
                150,
                25
        );

        add(jobField);

        JButton applyButton =
                new JButton("Apply");

        applyButton.setBounds(
                130,
                170,
                120,
                35
        );

        add(applyButton);

        applyButton.addActionListener(e -> {

            try {

                int studentId =
                        Integer.parseInt(
                                studentField.getText()
                        );

                int jobId =
                        Integer.parseInt(
                                jobField.getText()
                        );

                Application application =
                        new Application(
                                studentId,
                                jobId,
                                "Applied"
                        );

                ApplicationDAO dao =
                        new ApplicationDAO();

                boolean success =
                        dao.applyForJob(application);

                if(success) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Application Submitted!"
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Failed!"
                    );
                }

            } catch(Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Input!"
                );
            }
        });

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
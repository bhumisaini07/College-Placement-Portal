package ui;

import javax.swing.*;

public class AdminDashboard extends JFrame {

    public AdminDashboard() {

        setTitle("College Placement Portal - Admin Dashboard");

        setSize(500,450);

        setLayout(null);

        JLabel heading =
                new JLabel("ADMIN DASHBOARD");

        heading.setBounds(
                170,
                30,
                200,
                30
        );

        add(heading);
       
        JButton companyButton =
                new JButton("Add Company");

        companyButton.setBounds(
                150,
                80,
                180,
                35
        );

        add(companyButton);

        JButton jobButton =
                new JButton("Add Job");

        jobButton.setBounds(
                150,
                130,
                180,
                35
        );

        add(jobButton);

        JButton viewAppsButton =
                new JButton("View Applications");

        viewAppsButton.setBounds(
                150,
                180,
                180,
                35
        );

        add(viewAppsButton);

        JButton updateButton =
                new JButton("Update Status");
        updateButton.addActionListener(e -> {

    new UpdateStatusFrame();

});
        updateButton.setBounds(
                150,
                230,
                180,
                35
        );

        add(updateButton);

        JButton logoutButton =
                new JButton("Logout");

        logoutButton.setBounds(
                150,
                280,
                180,
                35
        );

        add(logoutButton);

        companyButton.addActionListener(e ->
                new AddCompanyFrame());

        jobButton.addActionListener(e ->
                new AddJobFrame());

        viewAppsButton.addActionListener(e ->
                new ApplicationStatusFrame());

        logoutButton.addActionListener(e -> {

            dispose();

            new AdminLoginFrame();

        });

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
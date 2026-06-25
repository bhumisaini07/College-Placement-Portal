package ui;

import javax.swing.*;

public class StudentDashboard extends JFrame {

    public StudentDashboard() {

        setTitle("College Placement Portal - Student Dashboard");

        setSize(500, 450);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        // Welcome Label
        JLabel welcomeLabel = new JLabel("WELCOME STUDENT");
        welcomeLabel.setBounds(170, 30, 200, 30);
        add(welcomeLabel);

        // View Profile Button
        JButton profileButton =
                new JButton("View Profile");

        profileButton.setBounds(
                150,
                80,
                180,
                35
        );

        add(profileButton);
        JLabel heading =
        new JLabel("STUDENT DASHBOARD");

heading.setBounds(
        150,
        20,
        250,
        30
);

heading.setFont(
        new java.awt.Font(
                "Arial",
                java.awt.Font.BOLD,
                18
        )
);

add(heading);

        // View Companies Button
        JButton companyButton =
                new JButton("View Companies");

        companyButton.setBounds(
                150,
                130,
                180,
                35
        );

        add(companyButton);

        // Apply for Job Button
        JButton applyButton =
                new JButton("Apply for Job");

        applyButton.setBounds(
                150,
                180,
                180,
                35
        );

        add(applyButton);

        // Application Status Button
        JButton statusButton =
                new JButton("Application Status");

        statusButton.setBounds(
                150,
                230,
                180,
                35
        );

        add(statusButton);

        // Logout Button
        JButton logoutButton =
                new JButton("Logout");

        logoutButton.setBounds(
                150,
                280,
                180,
                35
        );

        add(logoutButton);

        // Temporary Actions
        profileButton.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        this,
                        "Profile Module Coming Soon!"
                )
        );

       companyButton.addActionListener(e -> {

    new ViewCompaniesFrame();

});

        applyButton.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        this,
                        "Job Application Module Coming Soon!"
                )
        );

        statusButton.addActionListener(e -> {

    new ApplicationStatusFrame();

});

        logoutButton.addActionListener(e -> {

            dispose();

            new LoginFrame();

        });

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
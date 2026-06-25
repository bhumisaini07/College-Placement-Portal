package ui;

import javax.swing.*;

public class HomeFrame extends JFrame {

    public HomeFrame() {

        setTitle("College Placement Portal");

        setSize(450, 400);

        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel heading =
                new JLabel("COLLEGE PLACEMENT PORTAL");

        heading.setBounds(
                60,
                30,
                350,
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

        JButton studentLoginButton =
                new JButton("Student Login");

        studentLoginButton.setBounds(
                120,
                100,
                180,
                40
        );

        add(studentLoginButton);

        JButton registerButton =
                new JButton("Student Registration");

        registerButton.setBounds(
                120,
                160,
                180,
                40
        );

        add(registerButton);

        JButton adminLoginButton =
                new JButton("Admin Login");

        adminLoginButton.setBounds(
                120,
                220,
                180,
                40
        );

        add(adminLoginButton);

        JButton exitButton =
                new JButton("Exit");

        exitButton.setBounds(
                120,
                280,
                180,
                40
        );

        add(exitButton);

       studentLoginButton.addActionListener(e -> {

    new LoginFrame();

    dispose();

});

        registerButton.addActionListener(e -> {

            new RegisterFrame();
            dispose();

        });

        adminLoginButton.addActionListener(e -> {

            new AdminLoginFrame();
            dispose();

        });

        exitButton.addActionListener(e -> {

            System.exit(0);

        });

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
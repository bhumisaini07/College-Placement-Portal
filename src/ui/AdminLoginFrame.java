package ui;

import javax.swing.*;

public class AdminLoginFrame extends JFrame {

    public AdminLoginFrame() {

        setTitle("College Placement Portal - Admin Login");
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton backButton = new JButton("Back");
        backButton.setBounds(20, 20, 80, 30);
        add(backButton);

        backButton.addActionListener(e -> {

            new HomeFrame();

            dispose();

        });

        JLabel heading = new JLabel("ADMIN LOGIN");

        heading.setBounds(
                130,
                20,
                200,
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

        JLabel userLabel =
                new JLabel("Username:");

        userLabel.setBounds(
                50,
                80,
                100,
                25
        );

        add(userLabel);

        JTextField userField =
                new JTextField();

        userField.setBounds(
                150,
                80,
                150,
                25
        );

        add(userField);

        JLabel passLabel =
                new JLabel("Password:");

        passLabel.setBounds(
                50,
                130,
                100,
                25
        );

        add(passLabel);

        JPasswordField passField =
                new JPasswordField();

        passField.setBounds(
                150,
                130,
                150,
                25
        );

        add(passField);

        JButton loginButton =
                new JButton("Login");

        loginButton.setBounds(
                130,
                200,
                120,
                35
        );

        add(loginButton);

        loginButton.addActionListener(e -> {

            String username =
                    userField.getText();

            String password =
                    new String(
                            passField.getPassword()
                    );

            if(username.equals("admin")
                    && password.equals("admin123")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Admin Login Successful"
                );

                new AdminDashboard();

                dispose();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Credentials"
                );
            }
        });

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
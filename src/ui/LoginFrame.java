package ui;

import dao.StudentDAO;

import javax.swing.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setLayout(null);
        JLabel heading = new JLabel("COLLEGE PLACEMENT PORTAL");
heading.setBounds(100, 15, 300, 30);
heading.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
add(heading);

        setTitle("College Placement Portal - Login");

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 50, 100, 25);
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(130, 50, 180, 25);
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 100, 100, 25);
        add(passwordLabel);

        JPasswordField passwordField =
                new JPasswordField();

        passwordField.setBounds(130, 100, 180, 25);
        add(passwordField);

        JButton loginButton =
                new JButton("Login");

        loginButton.setBounds(130, 160, 100, 35);

        add(loginButton);

        loginButton.addActionListener(e -> {

            String email =
                    emailField.getText();

            String password =
                    new String(
                            passwordField.getPassword()
                    );

            StudentDAO dao =
                    new StudentDAO();

            boolean success =
                    dao.loginStudent(
                            email,
                            password
                    );

            if(success) {

                JOptionPane.showMessageDialog(
                        this,
                        "Login Successful"
                );

                dispose();

                new StudentDashboard();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Email or Password"
                );
            }
        });
        JButton backButton =
        new JButton("Back");

backButton.setBounds(
        20,
        20,
        80,
        30
);

add(backButton);
backButton.addActionListener(e -> {

    new HomeFrame();

    dispose();

});
        setLocationRelativeTo(null);
        setVisible(true);
    }
   
}

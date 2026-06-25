package ui;

import dao.StudentDAO;
import model.Student;

import javax.swing.*;

public class RegisterFrame extends JFrame {

    public RegisterFrame() {

        setTitle("College Placement Portal - Register");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel heading =
                new JLabel("STUDENT REGISTRATION");

       heading.setBounds(110, 20, 300, 30);
        heading.setFont(
                new java.awt.Font(
                        "Arial",
                        java.awt.Font.BOLD,
                        18
                )
        );

        add(heading);
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

        JLabel nameLabel =
                new JLabel("Name:");

        nameLabel.setBounds(
                30,
                70,
                100,
                25
        );

        add(nameLabel);

        JTextField nameField =
                new JTextField();

        nameField.setBounds(
                150,
                70,
                180,
                25
        );

        add(nameField);

        JLabel emailLabel =
                new JLabel("Email:");

        emailLabel.setBounds(
                30,
                110,
                100,
                25
        );

        add(emailLabel);

        JTextField emailField =
                new JTextField();

        emailField.setBounds(
                150,
                110,
                180,
                25
        );

        add(emailField);

        JLabel passwordLabel =
                new JLabel("Password:");

        passwordLabel.setBounds(
                30,
                150,
                100,
                25
        );

        add(passwordLabel);

        JPasswordField passwordField =
                new JPasswordField();

        passwordField.setBounds(
                150,
                150,
                180,
                25
        );

        add(passwordField);

        JLabel branchLabel =
                new JLabel("Branch:");

        branchLabel.setBounds(
                30,
                190,
                100,
                25
        );

        add(branchLabel);

        JTextField branchField =
                new JTextField();

        branchField.setBounds(
                150,
                190,
                180,
                25
        );

        add(branchField);

        JLabel cgpaLabel =
                new JLabel("CGPA:");

        cgpaLabel.setBounds(
                30,
                230,
                100,
                25
        );

        add(cgpaLabel);

        JTextField cgpaField =
                new JTextField();

        cgpaField.setBounds(
                150,
                230,
                180,
                25
        );

        add(cgpaField);

        JLabel skillsLabel =
                new JLabel("Skills:");

        skillsLabel.setBounds(
                30,
                270,
                100,
                25
        );

        add(skillsLabel);

        JTextField skillsField =
                new JTextField();

        skillsField.setBounds(
                150,
                270,
                180,
                25
        );

        add(skillsField);

        JButton registerButton =
                new JButton("Register");

        registerButton.setBounds(
                120,
                330,
                120,
                35
        );

        add(registerButton);

        registerButton.addActionListener(e -> {

            try {

                String name =
                        nameField.getText();

                String email =
                        emailField.getText();

                String password =
                        new String(
                                passwordField.getPassword()
                        );

                if(name.trim().isEmpty()
                        || email.trim().isEmpty()
                        || password.trim().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Please fill all fields!"
                    );

                    return;
                }

                if(!email.contains("@")) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Enter a valid email!"
                    );

                    return;
                }

                if(password.length() < 6) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Password must be at least 6 characters!"
                    );

                    return;
                }

                String branch =
                        branchField.getText();

                double cgpa =
                        Double.parseDouble(
                                cgpaField.getText()
                        );

                String skills =
                        skillsField.getText();

                Student student =
                        new Student(
                                name,
                                email,
                                password,
                                branch,
                                cgpa,
                                skills
                        );

                StudentDAO dao =
                        new StudentDAO();

                boolean success =
                        dao.registerStudent(student);

                if(success) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Registration Successful!"
                    );

                    dispose();

                    new LoginFrame();

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Registration Failed!"
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
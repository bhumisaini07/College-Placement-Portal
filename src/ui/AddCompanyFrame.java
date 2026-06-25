package ui;

import dao.CompanyDAO;
import model.Company;

import javax.swing.*;

public class AddCompanyFrame extends JFrame {

    public AddCompanyFrame() {

        setTitle("Add Company");

        setSize(450, 350);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        JLabel nameLabel =
                new JLabel("Company Name:");

        nameLabel.setBounds(30, 50, 120, 25);

        add(nameLabel);

        JTextField nameField =
                new JTextField();

        nameField.setBounds(
                180,
                50,
                180,
                25
        );

        add(nameField);

        JLabel packageLabel =
                new JLabel("Package (LPA):");

        packageLabel.setBounds(
                30,
                100,
                120,
                25
        );

        add(packageLabel);

        JTextField packageField =
                new JTextField();

        packageField.setBounds(
                180,
                100,
                180,
                25
        );

        add(packageField);

        JLabel cgpaLabel =
                new JLabel("Eligibility CGPA:");

        cgpaLabel.setBounds(
                30,
                150,
                120,
                25
        );

        add(cgpaLabel);

        JTextField cgpaField =
                new JTextField();

        cgpaField.setBounds(
                180,
                150,
                180,
                25
        );

        add(cgpaField);

        JButton addButton =
                new JButton("Add Company");

        addButton.setBounds(
                130,
                220,
                150,
                35
        );

        add(addButton);

        addButton.addActionListener(e -> {

            try {

                String companyName =
                        nameField.getText();

                double packageLpa =
                        Double.parseDouble(
                                packageField.getText()
                        );

                double cgpa =
                        Double.parseDouble(
                                cgpaField.getText()
                        );

                Company company =
                        new Company(
                                companyName,
                                packageLpa,
                                cgpa
                        );

                CompanyDAO dao =
                        new CompanyDAO();

                boolean success =
                        dao.addCompany(company);

                if(success) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Company Added Successfully!"
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
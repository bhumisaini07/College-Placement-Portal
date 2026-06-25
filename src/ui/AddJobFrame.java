package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddJobFrame extends JFrame {

    public AddJobFrame() {

        setTitle("Add Job");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel companyIdLabel = new JLabel("Company ID:");
        companyIdLabel.setBounds(50, 50, 100, 25);
        add(companyIdLabel);

        JTextField companyIdField = new JTextField();
        companyIdField.setBounds(160, 50, 150, 25);
        add(companyIdField);

        JLabel roleLabel = new JLabel("Role:");
        roleLabel.setBounds(50, 100, 100, 25);
        add(roleLabel);

        JTextField roleField = new JTextField();
        roleField.setBounds(160, 100, 150, 25);
        add(roleField);

        JButton addButton = new JButton("Add Job");
        addButton.setBounds(130, 180, 120, 35);
        add(addButton);

        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Job Added Successfully!"
                );

            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
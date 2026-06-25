package ui;

import dao.ApplicationDAO;

import javax.swing.*;

public class UpdateStatusFrame extends JFrame {

    public UpdateStatusFrame() {

        setTitle("Update Status");

        setSize(450,350);

        setLayout(null);

        JLabel idLabel =
                new JLabel("Application ID:");

        idLabel.setBounds(
                40,
                60,
                120,
                25
        );

        add(idLabel);

        JTextField idField =
                new JTextField();

        idField.setBounds(
                180,
                60,
                150,
                25
        );

        add(idField);

        JLabel statusLabel =
                new JLabel("Status:");

        statusLabel.setBounds(
                40,
                120,
                120,
                25
        );

        add(statusLabel);

        String[] statuses = {
                "Applied",
                "Selected",
                "Rejected"
        };

        JComboBox<String> statusBox =
                new JComboBox<>(statuses);

        statusBox.setBounds(
                180,
                120,
                150,
                25
        );

        add(statusBox);

        JButton updateButton =
                new JButton("Update");

        updateButton.setBounds(
                140,
                210,
                120,
                35
        );

        add(updateButton);

        updateButton.addActionListener(e -> {

            try {

                int applicationId =
                        Integer.parseInt(
                                idField.getText()
                        );

                String status =
                        statusBox
                                .getSelectedItem()
                                .toString();

                ApplicationDAO dao =
                        new ApplicationDAO();

                boolean success =
                        dao.updateStatus(
                                applicationId,
                                status
                        );

                if(success) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Status Updated!"
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Application Not Found!"
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
package ui;

import dao.CompanyDAO;
import model.Company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ViewCompaniesFrame extends JFrame {

    public ViewCompaniesFrame() {

        setTitle("Available Companies");

        setSize(600, 400);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {
                "Company Name",
                "Package (LPA)",
                "Eligibility CGPA"
        };

        DefaultTableModel model =
                new DefaultTableModel(
                        columns,
                        0
                );

        JTable table =
                new JTable(model);

        CompanyDAO dao =
                new CompanyDAO();

        ArrayList<Company> companies =
                dao.getAllCompanies();

        for(Company company : companies) {

            model.addRow(
                    new Object[] {

                            company.getCompanyName(),
                            company.getCompanyPackage(),
                            company.getEligibilityCgpa()
                    }
            );
        }

        JScrollPane scrollPane =
                new JScrollPane(table);

        add(scrollPane);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
package HealthMS;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchDoctor {
    public static Font font;
    public static Font font2;
    public static javax.swing.border.Border etched;

    public static JFrame searchDocFrame;
    public static JPanel searchDocPanel;
    public static JPanel profilePanel;


    public static JLabel docIdLabel;
    public static JLabel titleLabel;


    public static JTextField docID_TextField;

    public void searchDoc() {
        font2 = new Font(Font.SANS_SERIF, Font.BOLD, 17);
        etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);


        searchDocPanel = new JPanel();
        searchDocFrame = new JFrame("Search Doctor");
        searchDocFrame.setSize(1000,600);
        searchDocFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        searchDocFrame.add(searchDocPanel);

        profilePanel.setBounds(300,100,500,500);
        profilePanel.setBackground(Color.LIGHT_GRAY);
        searchDocFrame.add(profilePanel);
        searchDocPanel.setLayout(null);
        profilePanel.setLayout(null);


        //----------------------------  -------------//
        titleLabel = new JLabel("Search for Doctor");
        titleLabel.setBounds(50,10,500,50);
        titleLabel.setFont(font2);
        searchDocPanel.add(titleLabel);


        docIdLabel = new JLabel("Doctor ID");
        docIdLabel.setBounds(50,100,100,25);
        docIdLabel.setFont(font);
        searchDocPanel.add(docIdLabel);


        //-------------------------TEXT FIELDS---------------------------------//
        docID_TextField = new JTextField(20);
        docID_TextField.setBounds(150,100,165,25);
        docID_TextField.setBorder(etched);
        searchDocPanel.add(docID_TextField);


        //--------------------BUTTONS-----------------------------/
        //Defining the Back Navigation Button
        JButton btnBack = new JButton("Back");
        btnBack.setFont(font);
        btnBack.setBounds(0,5,50,30);
        btnBack.setBorder(etched);
        btnBack.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    Patient_Dashboard back = new Patient_Dashboard();
                    back.patientDashFrame.setVisible(true);
                    searchDocFrame.setVisible(false);
                }
            });
        searchDocPanel.add(btnBack);        


        JButton btnSearch = new JButton("Search");
        btnSearch.setBorder(etched);
        btnSearch.setBounds(150,150,100,40);
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Search a doctor

                JOptionPane.showMessageDialog(null,"Search complete");
            }
        });
        searchDocPanel.add(btnSearch);

        searchDocFrame.setVisible(true);

    }
}

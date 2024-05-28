package HealthMS;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Patient_Dashboard {

    //Creating our Form Objects
    public static JFrame patientDashFrame;
    public static JPanel patientDashPanel;
    public static JPanel profilePanel;

    //----------------LABELS------------//
    public static JLabel fullNameLabel;

    public static JLabel ageLabel;

    public static JLabel genderLabel;

    public static JLabel medHistoryLabel;

    public static JLabel medAidLabel;

    public static JLabel telLabel;

    public static JLabel emailLabel;

    public static JLabel resAddressLabel;
    public static JLabel passwordLabel;
    public static JLabel regSuccess;

    public static Font font;
    public static Font font2;
    public static Border etched;

    public void patientDashboard() {

        //--------------------------FRAME & PANELS-----------------------------------//
        //Defining Font object
        font = new Font(Font.SANS_SERIF,Font.PLAIN, 15);
        //Defining Border object
        etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);

        //Dashboard objects
        patientDashPanel = new JPanel();
        profilePanel = new JPanel();
        patientDashFrame = new JFrame("PATIENT DASHBOARD");
        patientDashFrame.setSize(1000,1000);
        patientDashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        patientDashFrame.add(patientDashPanel);
        patientDashFrame.add(profilePanel);


        //-----------------------LABELS--------------------//
        //Defining Full Name Label
        fullNameLabel = new JLabel("Full Name");
        profilePanel.add(fullNameLabel);

        //Defining Age Label
        ageLabel = new JLabel("Age");
        profilePanel.add(ageLabel);

        //Defining Gender LAbel
        genderLabel = new JLabel("Gender");
        profilePanel.add(genderLabel);

        //Defining Medical History Label
        medHistoryLabel = new JLabel("Medical History");
        profilePanel.add(medHistoryLabel);

        //Defining Medical Aid Label
        medAidLabel = new JLabel("Medical Aid");
        profilePanel.add(medAidLabel);

        //Defining Residential Address Label
        resAddressLabel = new JLabel("Residential Address");
        profilePanel.add(resAddressLabel);

        //Defining Telephone Label
        telLabel = new JLabel("Telephone: ");
        profilePanel.add(telLabel);

        //Defining Email Label
        emailLabel = new JLabel("Email: ");
        profilePanel.add(emailLabel);


        //Defining Success Label
        regSuccess = new JLabel("");




        //-----------------------PANELS---------------------------------//
        //Defining admin profile panel
        profilePanel.setSize(200,100);
        profilePanel.setBounds(200,10,500,200);
        profilePanel.setLayout(null);

        //Defining admin panel
        patientDashPanel.setBackground(Color.WHITE);
        patientDashPanel.setSize(1000,1000);
        patientDashPanel.add(profilePanel);
        patientDashPanel.setLayout(null);

        //---------------------------BUTTONS-----------------------//
        //Creating and Defining buttons
        JButton bookApp = new JButton("Book Appointment");
        bookApp.setBounds(100,300,150,100);
        bookApp.setFont(font);
        bookApp.setBorder(etched);
        bookApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Displays the Book Appointment window
                BookAppntment bookApp1 = new BookAppntment();
                bookApp1.bookApp();
            }
        });
        patientDashPanel.add(bookApp);

        //Creating and Defining the remove doctor button
        JButton cancelApp = new JButton("Cancel Appointment");
        cancelApp.setBounds(300,300,150,100);
        cancelApp.setFont(font);
        cancelApp.setBorder(etched);
        cancelApp.setBackground(Color.gray);
        cancelApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Displays the Cancel appointment Window
                CancelAppointment cancelApp1 = new CancelAppointment();
                cancelApp1.cancelApp();
            }
        });
        patientDashPanel.add(cancelApp);

        //Creating and Defining the Search doctor button
        JButton searchDoc = new JButton("Search Doctor");
        searchDoc.setBounds(500,300,150,100);
        searchDoc.setFont(font);
        searchDoc.setBorder(etched);
        searchDoc.setBackground(Color.gray);
        searchDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchDoctor search = new SearchDoctor();
                search.searchDoc();
            }
        });
        patientDashPanel.add(searchDoc);





        patientDashFrame.setVisible(true);
    }

}


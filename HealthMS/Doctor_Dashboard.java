package HealthMS;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Doctor_Dashboard {

    //Creating our Form Objects
    public static JFrame docDashFrame;
    public static JPanel docDashPanel;
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
    public static JLabel regSuccess;

    public static Font font;
    public static Font font2;
    public static Border etched;

    public void Doctor_Dashboard() {


        //--------------------------FRAME & PANELS-----------------------------------//
        //Defining Font object
        font = new Font(Font.SANS_SERIF,Font.PLAIN, 15);
        //Defining Border object
        etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);

        //Dashboard objects
        docDashPanel = new JPanel();
        profilePanel = new JPanel();
        docDashFrame = new JFrame("DOCTOR DASHBOARD");
        docDashFrame.setSize(1000,1000);
        docDashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        docDashFrame.add(docDashPanel);
        docDashFrame.add(profilePanel);


        //-----------------------PANELS---------------------------------//
        //Defining admin profile panel
        profilePanel.setSize(200,100);
        profilePanel.setBounds(200,10,500,200);
        profilePanel.setLayout(null);

        //Defining admin panel
        docDashPanel.setBackground(Color.lightGray);
        docDashPanel.setSize(1000,1000);
        docDashPanel.add(profilePanel);
        docDashPanel.setLayout(null);


        //-----------------------LABELS--------------------//
        //Defining Full Name Label
        fullNameLabel = new JLabel("Full Name: ");
        fullNameLabel.setBounds(200,15,500,200);
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




        //---------------------------BUTTONS-----------------------//
        //Creating and Defining the Check Appointment button
        JButton checkApp = new JButton("Check Appointment");
        checkApp.setBounds(150,300,150,100);
        checkApp.setFont(font);
        checkApp.setBorder(etched);
        checkApp.setBackground(Color.gray);
        docDashPanel.add(checkApp);

        //Creating and Defining the Cancel Appointment button
        JButton cancelApp = new JButton("Cancel Appointment");
        cancelApp.setBounds(400,300,150,100);
        cancelApp.setFont(font);
        cancelApp.setBorder(etched);
        cancelApp.setBackground(Color.gray);
        cancelApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CancelAppointment cancelApp2 = new CancelAppointment();
                cancelApp2.cancelApp();
            }
        });
        docDashPanel.add(cancelApp);

        //Defining the Cancel Button
        JButton btnExit = new JButton("Exit");
        btnExit.setFont(font);
        btnExit.setBounds(650,300,150,100);
        btnExit.setBorder(etched);
        btnExit.setBackground(Color.gray);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        docDashPanel.add(btnExit);



        docDashFrame.setVisible(true);
    }

}



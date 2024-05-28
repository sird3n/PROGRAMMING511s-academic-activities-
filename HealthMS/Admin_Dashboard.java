package HealthMS;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin_Dashboard {

    //Creating our Form Objects
    public static JFrame adminDashFrame;
    public static JPanel adminDashPanel;
    public static JPanel profilePanel;

    //----------------LABELS------------//
    public static JLabel userNameLabel;

    public static JLabel userDOBLabel;

    public static JLabel userGenderLabel;

    public static JLabel userJobLabel;

    public static JLabel userDepartmentLabel;

    public static JLabel telLabel;

    public static JLabel emailLabel;

    public static JLabel regSuccess;

    public static Font font;
    public static Font font2;
    public static Border etched;

    public void Admin_Dashboard() {


        //--------------------------FRAME & PANELS-----------------------------------//
        //Defining Font object
        font = new Font(Font.SANS_SERIF,Font.PLAIN, 15);
        //Defining Border object
        etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);

        //Dashboard objects
        adminDashPanel = new JPanel();
        profilePanel = new JPanel();
        adminDashFrame = new JFrame("ADMIN DASHBOARD");
        adminDashFrame.setSize(1000,1000);
        adminDashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminDashFrame.add(adminDashPanel);
        adminDashPanel.setBackground(Color.lightGray);
        adminDashFrame.add(profilePanel);



        UserAdmin adminDtls = new UserAdmin();
        String userDOB = adminDtls.dob;
        String userFullName = adminDtls.firstName + adminDtls.lastName;
        String userGender = adminDtls.gender;
        String userDepartment = adminDtls.departmnt;
        String userJob = adminDtls.job;
        String userTel = adminDtls.tel;
        String userEmail = adminDtls.email;



        //-----------------------LABELS--------------------//
        //Defining Name Label
        userNameLabel = new JLabel(userFullName);
        userNameLabel.setBounds(150,30,500,25);
        adminDashPanel.add(userNameLabel);

        //Defining Date Of Birth Label
        userDOBLabel = new JLabel(userDOB);
        userDOBLabel.setBounds(150,80,500,25);
        adminDashPanel.add(userDOBLabel);


        //Defining Gender label
        userGenderLabel = new JLabel(userGender);
        userGenderLabel.setBounds(150,110,500,25);
        adminDashPanel.add(userGenderLabel);


        //Defining Job Label
        userJobLabel = new JLabel(userJob);
        userJobLabel.setBounds(150,140,500,25);
        adminDashPanel.add(userJobLabel);


        //Defining Department Label
        userDepartmentLabel = new JLabel(userDepartment);
        userDepartmentLabel.setBounds(150,170,500,25);
        adminDashPanel.add(userDepartmentLabel);


        //Defining Telephone Label
        telLabel = new JLabel(userTel);
        telLabel.setBounds(150,200,500,25);
        adminDashPanel.add(telLabel);



        //Defining Email Label
        emailLabel = new JLabel(userEmail);
        emailLabel.setBounds(150,230,500,25);
        adminDashPanel.add(emailLabel);


        //Defining Success Label
        regSuccess = new JLabel("");


        //-----------------------PANELS---------------------------------//
        //Defining admin profile panel
        profilePanel.setSize(200,100);
        profilePanel.setBounds(200,10,500,200);
        profilePanel.setBorder(etched);
        profilePanel.setLayout(null);

        //Defining admin panel
        adminDashPanel.setSize(1000,1000);
        //adminDashPanel.add(profilePanel);
        adminDashPanel.setLayout(null);

        //---------------------------BUTTONS-----------------------//
        //Creating and Defining buttons
        JButton addDoc = new JButton("Add Doctor");
        addDoc.setBounds(100,300,150,100);
        addDoc.setFont(font);
        addDoc.setBorder(etched);
        addDoc.setBackground(Color.gray);
        addDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddDoc doc = new AddDoc();
                doc.addDoctor();
                adminDashFrame.setVisible(false);
            }
        });
        adminDashPanel.add(addDoc);

        //Creating and Defining the remove doctor button
        JButton removeDoc = new JButton("Remove Doctor");
        removeDoc.setBounds(350,300,150,100);
        removeDoc.setFont(font);
        removeDoc.setBorder(etched);
        removeDoc.setBackground(Color.gray);
        removeDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RemoveDoc removeDoc1 = new RemoveDoc();
                removeDoc1.removeDoc();

            }
        });
        adminDashPanel.add(removeDoc);

        //Defining the Cancel Button
        JButton btnExit = new JButton("Exit");
        btnExit.setFont(font);
        btnExit.setBounds(600,300,150,100);
        btnExit.setBorder(etched);
        btnExit.setBackground(Color.gray);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        adminDashPanel.add(btnExit);

        //Defining the Back Navigation Button
        JButton btnBack = new JButton("Back");
        btnBack.setFont(font);
        btnBack.setBounds(0,5,50,30);
        btnBack.setBorder(etched);
        btnBack.setBackground(Color.gray);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Landing_Page back = new Landing_Page();
                back.pageFrame.setVisible(true);
                adminDashFrame.setVisible(false);
            }
        });
        adminDashPanel.add(btnBack);




        adminDashFrame.setVisible(true);
    }

}

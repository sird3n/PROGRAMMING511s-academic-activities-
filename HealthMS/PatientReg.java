package HealthMS;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

public class PatientReg implements ActionListener {

    //--------------------------------PATIENT DETAILS---------------------------------------------------------//
    //Patient Variables
    public static String firstName;
    public static String lastName;
    public static int username;
    public static String password;
    public static String gender;
    public static String dob;
    public static String tel;
    public static String email;
    public static String resAddress;
    public static String medHistory;
    public static int medAid;

//-----------------------------FRAMES OBJECTS-------------------------------------//
    //Creating our Form Objects
    public static JFrame regFrame;
    public static JPanel regPanel;

    //----------------LABELS------------//
    public static JLabel firstNameLabel;

    public static JLabel lastNameLabel;

    public static JLabel dobLabel;

    public static JLabel genderLabel;

    public static JLabel medHistoryLabel;

    public static JLabel medAidLabel;

    public static JLabel telLabel;

    public static JLabel emailLabel;

    public static JLabel resAddressLabel;
    public static JLabel passwordLabel;
    public static JLabel regSuccess;

    public static JLabel instructionsLabel;

    public static JLabel passwordCLabel;


    //---------------TEXT FIELDS----------//

    public static JTextField firstName_TextField;

    public static JTextField lastName_TextField;

    public static JTextField dob_TextField;

    public static JTextField gender_TextField;

    public static JTextField medHistory_TextField;

    public static JTextField medAid_TextField;

    public static JTextField tel_TextField;

    public static JTextField email_TextField;

    public static JTextField resAddress_TextField;
    public static JPasswordField password_TextField;

    public static JPasswordField passwordC_PasswordField;

    //---------------FONT & BORDER---------//
    public static Font font;
    public static Font font2;
    public static Border etched;

    public void Patient_Reg() {
        
        //--------------------------------------------------------------------------------//
        //Creating Frame and Panel Objects
        regPanel = new JPanel();
        regFrame = new JFrame("Patient Registration Form");
        regFrame.setSize(800,800);
        regFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regFrame.add(regPanel);

        regPanel.setLayout(null);
        regPanel.setBackground(Color.LIGHT_GRAY);


        //-------------------------------------------------------------//
        //Defining Font object
        font = new Font(Font.MONOSPACED,Font.PLAIN, 15);
        font2 = new Font(Font.SANS_SERIF,Font.BOLD, 15);
        //Defining Border object
        etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);



        //-------------------------LABELS------------------------------------//
        //Defining Instructions Label
        instructionsLabel = new JLabel("Please Fill in all the details and fill in null where user has no input");
        instructionsLabel.setBounds(100,1,550,50);
        instructionsLabel.setFont(font2);
        regPanel.add(instructionsLabel);


        //Defining Full Name Label
        firstNameLabel = new JLabel("Full Name*");
        firstNameLabel.setBounds(10,50,100,25);
        firstNameLabel.setFont(font);
        regPanel.add(firstNameLabel);


        
        //Defining Last Name Label
        lastNameLabel = new JLabel("Last Name*");
        lastNameLabel.setBounds(10,100,100,25);
        lastNameLabel.setFont(font);
        regPanel.add(lastNameLabel);


        //Defining Date of Birth Label
        dobLabel = new JLabel("Date of Birth(YYYY-MM-DD)");
        dobLabel.setBounds(10,150,150,25);
        dobLabel.setFont(font);
        regPanel.add(dobLabel);


        //Defining Gender label
        genderLabel = new JLabel("Gender(M/F/Others)");
        genderLabel.setBounds(10,200,200,25);
        genderLabel.setFont(font);
        regPanel.add(genderLabel);


        //Defining Medical History Label
        medHistoryLabel = new JLabel("Medical History");
        medHistoryLabel.setBounds(10,250,200,25);
        medHistoryLabel.setFont(font);
        regPanel.add(medHistoryLabel);

        //Defining Medical Aid Label
        medAidLabel = new JLabel("Medical Aid");
        medAidLabel.setFont(font);
        medAidLabel.setBounds(10,300,100,25);
        regPanel.add(medAidLabel);

        //Defining Telephone Label
        telLabel = new JLabel("Telephone");
        telLabel.setBounds(10,350,100,25);
        telLabel.setFont(font);
        regPanel.add(telLabel);

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(10,400,100,25);
        emailLabel.setFont(font);
        regPanel.add(emailLabel);

        //Defining Residential Address Label
        resAddressLabel = new JLabel("Residential Address");
        resAddressLabel.setBounds(10,450,200,25);
        resAddressLabel.setFont(font);
        regPanel.add(resAddressLabel);

        //Defining Password Label
        passwordLabel = new JLabel("Password*");
        passwordLabel.setBounds(10,500,100,25);
        passwordLabel.setFont(font);
        regPanel.add(passwordLabel);

        //Defining Confirm Password Label
        passwordCLabel = new JLabel("Confirm Password*");
        passwordCLabel.setBounds(10,550,200,25);
        passwordCLabel.setFont(font);
        regPanel.add(passwordCLabel);

        //Defining Success Label upon Registration success
        regSuccess = new JLabel();
        regSuccess.setBounds(80,600,300,25);
        regPanel.add(regSuccess);


        //------------------------TEXT FIELDS-------------------------------------//
        //Defining Full Name TextField
        firstName_TextField = new JTextField(50);
        firstName_TextField.setBounds(250,50,165,25);
        firstName_TextField.setFont(font);
        firstName_TextField.setBorder(etched);
        regPanel.add(firstName_TextField);

        //Defining Full Name TextField
        lastName_TextField = new JTextField(50);
        lastName_TextField.setBounds(250,100,165,25);
        lastName_TextField.setFont(font);
        lastName_TextField.setBorder(etched);
        regPanel.add(lastName_TextField);

        //Defining Date of Birth TextField
        dob_TextField = new JTextField(20);
        dob_TextField.setBounds(250,150,165,25);
        dob_TextField.setFont(font);
        dob_TextField.setBorder(etched);
        regPanel.add(dob_TextField);

        //Defining Gender TextField
        gender_TextField = new JTextField(20);
        gender_TextField.setBounds(250,200,165,25);
        gender_TextField.setFont(font);
        gender_TextField.setBorder(etched);
        regPanel.add(gender_TextField);

        //Defining Medical History TextField
        medHistory_TextField = new JTextField(20);
        medHistory_TextField.setBounds(250,250,165,25);
        medHistory_TextField.setFont(font);
        medHistory_TextField.setBorder(etched);
        regPanel.add(medHistory_TextField);

        //Defining Medical Aid TextField
        medAid_TextField = new JTextField(20);
        medAid_TextField.setFont(font);
        medAid_TextField.setBounds(250,300,165,25);
        medAid_TextField.setBorder(etched);
        regPanel.add(medAid_TextField);

        //Defining Telephone TextField
        tel_TextField = new JTextField("+264 ",20);
        tel_TextField.setBounds(250,350,165,25);
        tel_TextField.setFont(font);
        tel_TextField.setBorder(etched);
        regPanel.add(tel_TextField);

        //Defining Email TextField
        email_TextField = new JTextField(20);
        email_TextField.setBounds(250,400,180,25);
        email_TextField.setFont(font);
        email_TextField.setBorder(etched);
        regPanel.add(email_TextField);

        //Defining Residential Address TextField
        resAddress_TextField = new JTextField(20);
        resAddress_TextField.setBounds(250,450,165,25);
        resAddress_TextField.setFont(font);
        resAddress_TextField.setBorder(etched);
        regPanel.add(resAddress_TextField);

        //Defining Password TextField
        password_TextField = new JPasswordField();
        password_TextField.setBounds(250,500,165,25);
        password_TextField.setBorder(etched);
        regPanel.add(password_TextField);

        //Defining Confirm Password TextField
        passwordC_PasswordField = new JPasswordField();
        passwordC_PasswordField.setBounds(250,550,165,25);
        passwordC_PasswordField.setBorder(etched);
        regPanel.add(passwordC_PasswordField);


        //--------------------BUTTONS-----------------------------/
        //Creating and Defining Register Button
        JButton btnReg = new JButton("Register");
        btnReg.setFont(font);
        btnReg.setBounds(250,650,110,25);
        btnReg.setBackground(Color.gray);
        btnReg.addActionListener(new PatientReg());
        regPanel.add(btnReg);


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
                    regFrame.setVisible(false);
                }
            });
        regPanel.add(btnBack);


        //Creating and Defining Cancel Button
        JButton btnCancelReg = new JButton("Cancel");
        btnCancelReg.setFont(font);
        btnCancelReg.setBounds(400,650,100,25);
        btnCancelReg.setBackground(Color.gray);
        btnCancelReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        regPanel.add(btnCancelReg);

        //Displaying The Window/Frame
        regFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        firstName = firstName_TextField.getText();
        lastName = lastName_TextField.getText();
        dob = dob_TextField.getText();
        gender = gender_TextField.getText();
        medHistory = medHistory_TextField.getText();
        medAid = Integer.parseInt(medAid_TextField.getText());
        resAddress = resAddress_TextField.getText();
        tel = tel_TextField.getText();
        email = email_TextField.getText();
        password = String.valueOf(password_TextField.getPassword());
        String confirmPassword = String.valueOf(passwordC_PasswordField.getPassword());

        if(firstName.isEmpty() ||lastName.isEmpty() || dob.isEmpty() || gender.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Please Fill In All Fields Marked With an asterik(*)");
            return;
        }
        else if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(
                    null,"Password do not match, try again");
            return;
        }else {
        
        final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
        final String USERNAME = "LogIN";
        final String PASSWORD = "Programming58";

        try{
            Connection connPatReg = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = connPatReg.createStatement();
            String sql = "INSERT INTO Patient (FirstName,LastName,Gender,DateOfBirth,Telephone,Email,ResidentialAddress,MedicalHistory,MedicalAid,pPassword)" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connPatReg.prepareStatement(sql);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, dob);
            preparedStatement.setString(5, tel);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, resAddress);
            preparedStatement.setString(8, medHistory);
            preparedStatement.setInt(9, medAid);
            preparedStatement.setString(10, password);

            //Insert row into the table
            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0) {
                user = new UserPat();
                user.firstName = firstName;
                user.lastName = lastName;
                user.gender = gender;
                user.dob = dob;
                user.tel = tel;
                user.email = email;
                user.resAddress = resAddress;
                user.medHistory = medHistory;
                user.medAid = medAid;
                
                ResultSet queryResult = stmt.executeQuery("EXECUTE sp_displayUsername");
                int result = 0;

                while(queryResult.next()){
                    if(addedRows > 0){
                        
                    result = queryResult.getInt(1);
                    JOptionPane.showMessageDialog(null,"Registered successfully, your username is "+result);

                    }
                }
            }

            stmt.close();
            connPatReg.close();
        }catch(Exception c){
            c.printStackTrace();
        }

        }
        //Registers the patient and Stores the patient data

        //Closes the Registration Form upon success
        regFrame.setVisible(false);

        //Bring up the Login Form
        LogIn login = new LogIn();
        login.LogIn();


    }
    public UserPat user;
    

}

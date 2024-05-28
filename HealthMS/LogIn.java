package HealthMS;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class LogIn implements ActionListener {
    public static JFrame lginFrame;
    public static JPanel lginPanel;
    public static JLabel userLabel;
    public static JLabel passwordLabel;
    public static JLabel uTypeLabel;
    public static JTextField userTextField;
    public static JTextField uType;
    public static JPasswordField passwordTextField;
    public static JLabel lginSuccess;

    public static JLabel UserTypeLabel;

    public static Font font;
    public static Border etched;

    public void LogIn() {
        //--------------------------------------------------------------------------------//
        //Creating Frame and Panel Objects
        lginPanel = new JPanel();
        lginFrame = new JFrame("Log in");
        lginFrame.setSize(350,200);
        lginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lginFrame.add(lginPanel);

        lginPanel.setLayout(null);

        //-------------------------------------------------------------//
        //Creating Font object
        font = new Font(Font.SANS_SERIF,Font.PLAIN, 15);
        //Creating Border object
        etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);



        //-------------------------LABELS------------------------------------//
        //User type Message
        String message = "Enter: [1] For Admin [2] For Doctor [3] For Patient";
        UserTypeLabel = new JLabel();
        UserTypeLabel.setText(message);
        lginPanel.add(UserTypeLabel);

        //Creating and Defining user Type Label
        uTypeLabel = new JLabel("User Type");
        uTypeLabel.setBounds(10,20,100,25);
        uTypeLabel.setFont(font);
        lginPanel.add(uTypeLabel);


        //Creating and defining User Label
        userLabel = new JLabel("Username");
        userLabel.setBounds(10,50,80,25);
        userLabel.setFont(font);
        lginPanel.add(userLabel);


        //Creating and Defining Password Label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,80,80,25);
        passwordLabel.setFont(font);
        lginPanel.add(passwordLabel);


        //Creating and Defining Success Label upon Log in success
        lginSuccess = new JLabel();
        lginSuccess.setBounds(80,110,300,25);
        lginPanel.add(lginSuccess);


        //------------------------TEXT FIELDS-------------------------------------//
        //Creating and Defining user TextField
        userTextField = new JTextField(20);
        userTextField.setBounds(100,50,165,25);
        userTextField.setBorder(etched);
        lginPanel.add(userTextField);


        //Creating and Defining User Type TextField
        uType = new JTextField(20);
        uType.setBounds(100,20,165,25);
        uType.setBorder(etched);
        lginPanel.add(uType);


        //Creating and Defining Password TextField
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(100,80,165,25);
        passwordTextField.setBorder(etched);
        lginPanel.add(passwordTextField);


        //--------------------BUTTONS-----------------------------/
        //Creating log in Button
        JButton btnLogin = new JButton("Log in");
        btnLogin.setFont(font);
        btnLogin.setBounds(100,110,80,25);
        btnLogin.addActionListener(new LogIn());
        lginPanel.add(btnLogin);

        lginFrame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String userType = uType.getText();
        int userID = Integer.parseInt(userTextField.getText());
        String loginPassword = String.valueOf(passwordTextField.getPassword());

        //Authenticates an Admin and logs them in
        if(userType.equals("1")){
            user1 = getAuthenticatedUser1(userID, loginPassword);

            if (user1 != null) {
                Admin_Dashboard dash = new Admin_Dashboard();
                //Displays admin dashboard upon log in
                dash.Admin_Dashboard();
                lginFrame.setVisible(false);
                
              }
            else {
                JOptionPane.showMessageDialog(null,
                        "Username or Password Invalid",
                        "Try again",                            
                        JOptionPane.ERROR_MESSAGE);
                }


        }
        //Authenticates a Doctor and logs them in
        else if(userType.equals("2")){
            user2 = getAuthenticatedUser2(userID, loginPassword);

            if (user2 != null) {
                
                Doctor_Dashboard doctorDash = new Doctor_Dashboard();
                //Displays the doctor dashboard upon log in
                doctorDash.Doctor_Dashboard();
                lginFrame.setVisible(false);
                
              }
            else {
                JOptionPane.showMessageDialog(null,
                        "Username or Password Invalid",
                        "Try again",                            
                        JOptionPane.ERROR_MESSAGE);
                }


        }
        //Authenticates a Patient and logs them in
        else if(userType.equals("3")){
            
            user3 = getAuthenticatedUser3(userID, loginPassword);

            if (user3 != null) {
                Patient_Dashboard patientDash = new Patient_Dashboard();
                //Displays the patient dashboard upon log in
                patientDash.patientDashboard();
                lginFrame.setVisible(false);
                
              }
            else {
                JOptionPane.showMessageDialog(null,
                    "Username or Password Invalid",
                    "Try again",                            
                    JOptionPane.ERROR_MESSAGE);
                }
        }



    }
    //System Users
    public static UserAdmin user1; //Admin
    public static UserDoc user2; //Doctor
    public static UserPat user3; //Patient


    //====================================================ADMINISTARTOR=============================================================//
    //Autheticating Admin
    private UserAdmin getAuthenticatedUser1(int username, String password) {
        UserAdmin user1 = null;

        final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
        final String USERNAME = "LogIn";
        final String PASSWORD = "Programming58";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Administrator WHERE Userid=? AND aPassword=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user1 = new UserAdmin();
                user1.firstName = resultSet.getString("FirstName");
                user1.lastName = resultSet.getString("LastName");
                user1.userNAME = resultSet.getInt("Userdid");
                user1.departmnt = resultSet.getString("Department");
                user1.email = resultSet.getString("Email");
                user1.job = resultSet.getString("Job");
                user1.tel = resultSet.getString("Telephone");
                user1.dob = resultSet.getString("DateOfBirth");
                user1.gender = resultSet.getString("Gender");

            }
            /* 
            Admin_Dashboard admin = new Admin_Dashboard();
            String fullName = user.firstName + user.lastName;
            admin.userGenderLabel.setText(user.gender);
            admin.emailLabel.setText(user.email);
            admin.userNameLabel.setText(fullName);
            admin.userJobLabel.setText(user.job);
            admin.userDepartmentLabel.setText(user.departmnt);
            admin.userDOBLabel.setText(user.dob);
            admin.telLabel.setText(user.tel);
            */

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        //Returns Admin
        return user1;
    }
    
    //====================================================DOCTOR=============================================================//
    //Authenticating the Doctor
    private UserDoc getAuthenticatedUser2(int username, String password) {
        UserDoc user2 = null;

        final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
        final String USERNAME = "LogIn";
        final String PASSWORD = "Programming58";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Doctor WHERE Userid=? AND dPassword=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user2 = new UserDoc();
                user2.firstName = resultSet.getString("FirstName");
                user2.title = resultSet.getString("Title");
                user2.lastName = resultSet.getString("LastName");
                user2.roomNo = resultSet.getInt("RoomNo");
                user2.username = resultSet.getInt("Userid");
                user2.department = resultSet.getString("Department");
                user2.email = resultSet.getString("Email");
                user2.Specialisation = resultSet.getString("Specialization");
                user2.tel = resultSet.getString("Telephone");
                user2.dob = resultSet.getString("DateOfBirth");
                user2.gender = resultSet.getString("Gender");

                
            }
                

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        //Returns Doctor
        return user2;
    }
    
    //====================================================PATIENT=============================================================//
    //Authenticating the Patient
    private UserPat getAuthenticatedUser3(int username, String password) {
         UserPat user3 = null;
    
        final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
        final String USERNAME = "LogIn";
        final String PASSWORD = "Programming58";
    
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
    
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Patient WHERE Username=? AND pPassword=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, username);
            preparedStatement.setString(2, password);
    
            ResultSet resultSet = preparedStatement.executeQuery();
    
            if (resultSet.next()) {
                user3 = new UserPat();
                user3.firstName = resultSet.getString("FirstName");
                user3.lastName = resultSet.getString("LastName");
                user3.medAid = resultSet.getInt("MedicalAid");
                user3.username = resultSet.getInt("Username");
                user3.medHistory = resultSet.getString("MedicalHistory");
                user3.email = resultSet.getString("Email");
                user3.resAddress = resultSet.getString("ResidentialAddress");
                user3.tel = resultSet.getString("Telephone");
                user3.dob = resultSet.getString("DateOfBirth");
                user3.gender = resultSet.getString("Gender");
    
                }
                    
    
            stmt.close();
            conn.close();
    
            }catch(Exception e){
                e.printStackTrace();
            }
    
            //Returns Patient
            return user3;
        }
}
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
import java.sql.Statement;

public class AddDoc {

    //Creating our Form Objects
    public static JFrame DocRegFrame;
    public static JPanel DocRegPanel;

    //----------------LABELS------------//
    public static JLabel titleLabel;
    public static JLabel firstNameLabel;

    public static JLabel lastNameLabel;

    public static JLabel usernameLabel;

    public static JLabel genderLabel;
    public static JLabel departmentLabel;

    public static JLabel specializationLabel;

    public static JLabel roomNoLabel;

    public static JLabel dobLabel;
    public static JLabel refNoLabel;

    public static JLabel emailLabel;

    public static JLabel telLabel;
    public static JLabel passwordLabel;
    public static JLabel regSuccess;

    public static JLabel instructionsLabel;

    public static JLabel passwordCLabel;


    //---------------TEXT FIELDS----------//
    public static JTextField title_TextField;
    public static JTextField firstName_TextField;

    public static JTextField lastName_TextField;

    public static JTextField username_TextField;

    public static JTextField gender_TextField;

    public static JTextField refNo_TextField;

    public static JTextField specialization_TextField;

    public static JTextField department_TextField;

    public static JTextField tel_TextField;

    public static JTextField email_TextField;

    public static JTextField dob_TextField;
    public static JTextField roomNo_TextField;
    public static JPasswordField password_PasswordField;

    public static JPasswordField passwordC_PasswordField;


    public void addDoctor() {
        //--------------------------------------------------------------------------------//
        //Creating Frame and Panel Objects
        DocRegPanel = new JPanel();
        DocRegFrame = new JFrame("Doctor Registration Form");
        DocRegFrame.setSize(800,1000);
        DocRegFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DocRegFrame.add(DocRegPanel);

        DocRegPanel.setLayout(null);
        DocRegPanel.setBackground(Color.lightGray);



        //-------------------------------------------------------------//
        //Defining Font object
       Font font = new Font(Font.MONOSPACED,Font.PLAIN, 15);
       Font font2 = new Font(Font.SANS_SERIF,Font.BOLD, 15);
        //Defining Border object
       Border etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);



        //-------------------------LABELS------------------------------------//
        //Defining Instructions Label
        instructionsLabel = new JLabel("Please Fill in all the details and fill in null where user has no input");
        instructionsLabel.setBounds(100,0,550,50);
        instructionsLabel.setFont(font2);
        DocRegPanel.add(instructionsLabel);

        //Defining Tilte label
        titleLabel = new JLabel("Title");
        titleLabel.setBounds(10,40,200,25);
        titleLabel.setFont(font);
        DocRegPanel.add(titleLabel);

        //Defining Doctor's Reference Number Label
        refNoLabel = new JLabel("Reference Number");
        refNoLabel.setBounds(10,80,200,25);
        refNoLabel.setFont(font);
        DocRegPanel.add(refNoLabel);
        
        //Defining First Name Label
        firstNameLabel = new JLabel("First Name*");
        firstNameLabel.setBounds(10,120,100,25);
        firstNameLabel.setFont(font);
        DocRegPanel.add(firstNameLabel);


        //Defining Last Name Label
        lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setBounds(10,160,100,25);
        lastNameLabel.setFont(font);
        DocRegPanel.add(lastNameLabel);

        //Defining Gender label
        genderLabel = new JLabel("Gender(M/F/Others)");
        genderLabel.setBounds(10,200,200,25);
        genderLabel.setFont(font);
        DocRegPanel.add(genderLabel);

        //Defining Date Of Birth Label
        dobLabel = new JLabel("Date of Birth");
        dobLabel.setBounds(10,240,100,25);
        dobLabel.setFont(font);
        DocRegPanel.add(dobLabel);

        //Defining Doctor's Username Label
        usernameLabel = new JLabel("Userid");
        usernameLabel.setBounds(10,280,200,25);
        usernameLabel.setFont(font);
        DocRegPanel.add(usernameLabel);

        //Defining Specialization Label
        specializationLabel = new JLabel("Specialization");
        specializationLabel.setFont(font);
        specializationLabel.setBounds(10,320,100,25);
        DocRegPanel.add(specializationLabel);

        //Defining Department TextField
        departmentLabel = new JLabel("Department");
        departmentLabel.setBounds(10,360,165,25);
        departmentLabel.setFont(font);
        DocRegPanel.add(departmentLabel);

        //Defining Room Number Label
        roomNoLabel = new JLabel("Room Number");
        roomNoLabel.setBounds(10,400,200,25);
        roomNoLabel.setFont(font);
        DocRegPanel.add(roomNoLabel);

        //Defining Telephone Label
        telLabel = new JLabel("Telephone");
        telLabel.setBounds(10,440,100,25);
        telLabel.setFont(font);
        DocRegPanel.add(telLabel);

        //Defining Email Label
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(10,480,100,25);
        emailLabel.setFont(font);
        DocRegPanel.add(emailLabel);

        //Defining Password Label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,520,100,25);
        passwordLabel.setFont(font);
        DocRegPanel.add(passwordLabel);

        //Defining Confirm Password Label
        passwordCLabel = new JLabel("Confirm Password");
        passwordCLabel.setBounds(10,560,200,25);
        passwordCLabel.setFont(font);
        DocRegPanel.add(passwordCLabel);




        //------------------------TEXT FIELDS-------------------------------------//
        //Defining Title TextField
        title_TextField = new JTextField(20);
        title_TextField.setBounds(250,40,165,25);
        title_TextField.setFont(font);
        title_TextField.setBorder(etched);
        DocRegPanel.add(title_TextField);
 
        //Defining Doctor's Reference Number TextField
        refNo_TextField = new JTextField(20);
        refNo_TextField.setFont(font);
        refNo_TextField.setBounds(250,80,165,25);
        refNo_TextField.setBorder(etched);
        DocRegPanel.add(refNo_TextField);        
        

        //Defining Full Name TextField
        firstName_TextField = new JTextField(50);
        firstName_TextField.setBounds(250,120,165,25);
        firstName_TextField.setFont(font);
        firstName_TextField.setBorder(etched);
        DocRegPanel.add(firstName_TextField);


        //Defining Last Name TextField
        lastName_TextField = new JTextField(20);
        lastName_TextField.setBounds(250,160,165,25);
        lastName_TextField.setFont(font);
        lastName_TextField.setBorder(etched);
        DocRegPanel.add(lastName_TextField);

        //Defining Gender TextField
        gender_TextField = new JTextField(20);
        gender_TextField.setBounds(250,200,165,25);
        gender_TextField.setFont(font);
        gender_TextField.setBorder(etched);
        DocRegPanel.add(gender_TextField);

        //Defining Date of Birth TextField
        dob_TextField = new JTextField(20);
        dob_TextField.setFont(font);
        dob_TextField.setBounds(250,240,165,25);
        dob_TextField.setBorder(etched);
        DocRegPanel.add(dob_TextField);

        //Defining the Username TextFielddob
        username_TextField = new JTextField(20);
        username_TextField.setFont(font);
        username_TextField.setBounds(250,280,165,25);
        username_TextField.setBorder(etched);
        DocRegPanel.add(username_TextField);

        //Defining Specialization TextField
        specialization_TextField = new JTextField(20);
        specialization_TextField.setBounds(250,320,165,25);
        specialization_TextField.setFont(font);
        specialization_TextField.setBorder(etched);
        DocRegPanel.add(specialization_TextField);

        //Defining Department TextField
        department_TextField = new JTextField(20);
        department_TextField.setBounds(250,360,165,25);
        department_TextField.setFont(font);
        department_TextField.setBorder(etched);
        DocRegPanel.add(department_TextField);

        //Defining Doctor's Room Number TextField
        roomNo_TextField = new JTextField(20);
        roomNo_TextField.setBounds(250,400,165,25);
        roomNo_TextField.setFont(font);
        roomNo_TextField.setBorder(etched);
        DocRegPanel.add(roomNo_TextField);

        //Defining Telephone TextField
        tel_TextField = new JTextField("+264 ",20);
        tel_TextField.setBounds(250,440,165,25);
        tel_TextField.setFont(font);
        tel_TextField.setBorder(etched);
        DocRegPanel.add(tel_TextField);

        //Defining Email TextField
        email_TextField = new JTextField(20);
        email_TextField.setBounds(250,480,180,25);
        email_TextField.setFont(font);
        email_TextField.setBorder(etched);
        DocRegPanel.add(email_TextField);


        //Defining Password TextField
        password_PasswordField = new JPasswordField();
        password_PasswordField.setBounds(250,520,165,25);
        password_PasswordField.setBorder(etched);
        DocRegPanel.add(password_PasswordField);

        //Defining Confirm Password TextField
        passwordC_PasswordField = new JPasswordField();
        passwordC_PasswordField.setBounds(250,560,165,25);
        passwordC_PasswordField.setBorder(etched);
        DocRegPanel.add(passwordC_PasswordField);


        //--------------------BUTTONS-----------------------------/
        //Creating and Defining Register Button
        JButton btnReg = new JButton("Add Doctor");
        btnReg.setFont(font);
        btnReg.setBounds(250,600,150,25);
        btnReg.setBackground(Color.gray);
        btnReg.addActionListener(new PatientReg());
        btnReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               String firstName = firstName_TextField.getText();
               int refNo = Integer.parseInt(refNo_TextField.getText());
               String title = title_TextField.getText();
               int username = Integer.parseInt(username_TextField.getText());
               String password = String.valueOf(password_PasswordField.getPassword());
               String passwordConfirm = String.valueOf(passwordC_PasswordField.getPassword());
               String gender = gender_TextField.getText();
               String lastName = lastName_TextField.getText();
               String tel = tel_TextField.getText();
               String email = email_TextField.getText();
               String department = department_TextField.getText();
               String Specialisation = specialization_TextField.getText();
               int roomNo = Integer.parseInt(roomNo_TextField.getText());
               String dob = dob_TextField.getText();


                if(firstName.isEmpty() ||lastName.isEmpty() || password.isEmpty() || Specialisation.isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "Please Fill In All Fields Marked With an asterik(*)");
                    return;
                }
                else if(!password.equals(passwordConfirm)){
                    JOptionPane.showMessageDialog(
                            null,"Password do not match, try again");
                    return;
                }else {
                    final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
                    final String USERNAME = "LogIN";
                    final String PASSWORD = "Programming58";

                    try{
                        Connection connDocReg = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                        // Connected to database successfully...

                        Statement stmt = connDocReg.createStatement();
                        String sql = "INSERT INTO Doctor (RefNo,Title,FirstName,LastName,Gender,Specialization,Department,DateOFBirth,Telephone,Email,Userid,dPassword,RoomNo) " +
                                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStatement = connDocReg.prepareStatement(sql);
                        preparedStatement.setInt(1, refNo);
                        preparedStatement.setString(2, title);
                        preparedStatement.setString(3, firstName);
                        preparedStatement.setString(4, lastName);
                        preparedStatement.setString(5, gender);
                        preparedStatement.setString(6, Specialisation);
                        preparedStatement.setString(7, department);
                        preparedStatement.setString(8, dob);
                        preparedStatement.setString(9, tel);
                        preparedStatement.setString(10, email);
                        preparedStatement.setInt(11, username);
                        preparedStatement.setString(12, password);
                        preparedStatement.setInt(13, roomNo);

                        //Insert row into the table
                        int addedRows = preparedStatement.executeUpdate();
                        if (addedRows > 0) {
                            user = new UserDoc();
                            user.firstName = firstName;
                            user.lastName = lastName;
                            user.username = username;
                            user.gender = gender;
                            user.dob = dob;
                            user.refNo = refNo;
                            user.Specialisation = Specialisation;
                            user.tel = tel;
                            user.email = email;
                            user.title = title;
                            user.department = department;
                            user.roomNo = roomNo;
                            user.password = password;
                            JOptionPane.showMessageDialog(null,"Registered successfully");
                            }

                        stmt.close();
                        connDocReg.close();
                    }catch(Exception c){
                        c.printStackTrace();
                    }
          
                }
            }
        });
        DocRegPanel.add(btnReg);

        //Defining the Back Navigation Button
        JButton btnBack = new JButton("Back");
        btnBack.setFont(font);
        btnBack.setBounds(0,5,50,30);
        btnBack.setBorder(etched);
        btnBack.setBackground(Color.gray);
        btnBack.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    Admin_Dashboard back = new Admin_Dashboard();
                    back.adminDashFrame.setVisible(true);
                    DocRegFrame.setVisible(false);
                }
            });
        DocRegPanel.add(btnBack);



        //Creating and Defining Cancel Button
        JButton btnCancelReg = new JButton("Cancel");
        btnCancelReg.setFont(font);
        btnCancelReg.setBounds(430,600,150,25);
        btnCancelReg.setBackground(Color.gray);
        btnCancelReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        DocRegPanel.add(btnCancelReg);

        //Displaying The Window/Frame
        DocRegFrame.setVisible(true);
    }
    public static UserDoc user;

}


package HealthMS;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookAppntment {
    public static Font font;
    public static Font font2;
    public static javax.swing.border.Border etched;

    public static JFrame bookApFrame;
    public static JPanel bookApPanel;


    public static JLabel patientLabel;
    public static JLabel doctorLabel;
    public static JLabel dateTimeLabel;
    public static JLabel titleLabel;


    public static JTextField patient_TextField;
    public static JTextField doctor_TextField;
    public static JTextField dateTime_TextField;


    public void bookApp() {
        font2 = new Font(Font.SANS_SERIF, Font.BOLD, 17);
        etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);


        bookApPanel = new JPanel();
        bookApFrame = new JFrame("Appointment");
        bookApFrame.setSize(800,500);
        bookApFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bookApFrame.add(bookApPanel);
        bookApPanel.setBackground(Color.lightGray);
        bookApPanel.setLayout(null);



          //----------------------------  -------------//
        titleLabel = new JLabel("Book Appointment");
        titleLabel.setBounds(50,50,500,50);
        titleLabel.setFont(font2);
        bookApPanel.add(titleLabel);


        patientLabel = new JLabel("PatientID");
        patientLabel.setBounds(50,150,100,25);
        patientLabel.setFont(font);
        bookApPanel.add(patientLabel);


        doctorLabel = new JLabel("DoctorID");
        doctorLabel.setBounds(50,200,100,25);
        doctorLabel.setFont(font);
        bookApPanel.add(doctorLabel);

        dateTimeLabel = new JLabel("Date-Time(YYYY-MM-DD HH:MM:SS)");
        dateTimeLabel.setBounds(50,250,500,25);
        dateTimeLabel.setFont(font);
        bookApPanel.add(dateTimeLabel);


    //-------------------------TEXT FIELDS---------------------------------//
        patient_TextField = new JTextField(20);
        patient_TextField.setBounds(250,150,165,25);
        patient_TextField.setBorder(etched);
        bookApPanel.add(patient_TextField);


        doctor_TextField = new JTextField(20);
        doctor_TextField.setBounds(250,200,165,25);
        doctor_TextField.setBorder(etched);
        bookApPanel.add(doctor_TextField);

        dateTime_TextField = new JTextField(20);
        dateTime_TextField.setBounds(250,250,165,25);
        dateTime_TextField.setBorder(etched);
        bookApPanel.add(dateTime_TextField);



        //--------------------BUTTONS-----------------------------/
        //Defining the Back Navigation Button
        JButton btnBack = new JButton("Back");
        btnBack.setFont(font);
        btnBack.setBounds(0,5,50,30);
        btnBack.setBorder(etched);
        btnBack.setBackground(Color.gray);
        btnBack.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    Patient_Dashboard back = new Patient_Dashboard();
                    back.patientDashFrame.setVisible(true);
                    bookApFrame.setVisible(false);
                }
            });
        bookApPanel.add(btnBack);  


        JButton btnBook = new JButton("Request");
        btnBook.setBorder(etched);
        btnBook.setBounds(250,300,100,40);
        btnBack.setBackground(Color.gray);
        btnBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int patientUsername = Integer.parseInt(patient_TextField.getText());
                int doctorUsername = Integer.parseInt(doctor_TextField.getText());
                String date = dateTime_TextField.getText();

                //Book Appointment
                final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
                    final String USERNAME = "LogIN";
                    final String PASSWORD = "Programming58";

                    try{
                        Connection connBookApp = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                        // Connected to database successfully...

                        Statement stmt = connBookApp.createStatement();
                        String sql = "INSERT INTO Appointment (Doctor,Patient,Date_Time) " +
                                "VALUES (?,?,?)";
                        PreparedStatement preparedStatement = connBookApp.prepareStatement(sql);
                        preparedStatement.setInt(1, doctorUsername);
                        preparedStatement.setInt(2,patientUsername);
                        preparedStatement.setString(3, date);

                        //Insert row into the table
                        int addedRows = preparedStatement.executeUpdate();
                        if (addedRows > 0) {
                            JOptionPane.showMessageDialog(null,"Request Sent");

                            ResultSet queryResult = stmt.executeQuery("EXECUTE sp_displayAppointment");
                            int result = 0;

                            while(queryResult.next()){
                            result = queryResult.getInt(1);
                            JOptionPane.showMessageDialog(null,"Your Appointment Number is "+result);
                    
                          }
                          queryResult.close();
                            }

                        stmt.close();
                        connBookApp.close();
                    }catch(Exception c){
                        c.printStackTrace();
                    }
            }
        });
        bookApPanel.add(btnBook);

        bookApFrame.setVisible(true);

    }
}

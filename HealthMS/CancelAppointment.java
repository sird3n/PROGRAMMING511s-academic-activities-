package HealthMS;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.Statement;

public class CancelAppointment {
    public static Font font;
    public static Font font2;
    public static javax.swing.border.Border etched;

    public static JFrame cancelApFrame;
    public static JPanel cancelApPanel;


    public static JLabel appntmentNoLabel;
    public static JLabel titleLabel;


    public static JTextField appntmentNo_TextField;

    public void cancelApp() {
        font2 = new Font(Font.SANS_SERIF, Font.BOLD, 17);
        etched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);


        cancelApPanel = new JPanel();
        cancelApFrame = new JFrame("Appointment");
        cancelApFrame.setSize(500,400);
        cancelApFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cancelApFrame.add(cancelApPanel);
        cancelApPanel.setBackground(Color.lightGray);
        cancelApPanel.setLayout(null);



        //----------------------------  -------------//
        titleLabel = new JLabel("Cancel Appointment");
        titleLabel.setBounds(50,50,500,50);
        titleLabel.setFont(font2);
        cancelApPanel.add(titleLabel);


        appntmentNoLabel = new JLabel("AppointmentNo");
        appntmentNoLabel.setBounds(50,150,100,25);
        appntmentNoLabel.setFont(font);
        cancelApPanel.add(appntmentNoLabel);


        //-------------------------TEXT FIELDS---------------------------------//
        appntmentNo_TextField = new JTextField(20);
        appntmentNo_TextField.setBounds(150,150,165,25);
        appntmentNo_TextField.setBorder(etched);
        cancelApPanel.add(appntmentNo_TextField);

        //--------------------BUTTONS-----------------------------//
        //Cancel Button
        JButton btnCancel = new JButton("Confirm");
        btnCancel.setBorder(etched);
        btnCancel.setBounds(150,200,100,40);
        btnCancel.setBackground(Color.gray);
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int appointmentNo = Integer.parseInt(appntmentNo_TextField.getText());

                //Cancel or Delete Appointment
                final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
                final String USERNAME = "LogIN";
                final String PASSWORD = "Programming58";

                try{
                    Connection connBookApp = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    // Connected to database successfully...

                    Statement stmt = connBookApp.createStatement();
                    String sql = "DELETE FROM Appointment WHERE AppointmentNo=?";
                    PreparedStatement preparedStatement = connBookApp.prepareStatement(sql);
                    preparedStatement.setInt(1, appointmentNo);

                    //Insert row into the table
                    int deletedRows = preparedStatement.executeUpdate();
                    if (deletedRows > 0) {
                        JOptionPane.showMessageDialog(null,"Appointment Cancelled");
                      }
                        

                    stmt.close();
                    connBookApp.close();
                }catch(Exception c){
                    c.printStackTrace();
                }
            }
        });
        cancelApPanel.add(btnCancel);

        cancelApFrame.setVisible(true);

    }
}

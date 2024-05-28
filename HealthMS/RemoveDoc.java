package HealthMS;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class RemoveDoc {
    public static JFrame removeFrame;
    public static JPanel removePanel;
    public static JLabel usernameLabel;
    public static JLabel titleLabel;
    public static JTextField username_TextField;

    public static Font font;

    public static  Font font2;
    public static Border etched;

    public void removeDoc() {
        font2 = new Font(Font.SANS_SERIF,Font.BOLD, 17);


        removePanel = new JPanel();
        removeFrame = new JFrame("Admin: Remove Doctor");
        removeFrame.setSize(550,500);
        removeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        removeFrame.add(removePanel);
        removePanel.setLayout(null);


        titleLabel = new JLabel("To remove a doctor, Please provide [Doctor Username]");
        titleLabel.setBounds(50,50,500,50);
        titleLabel.setFont(font2);
        removePanel.add(titleLabel);


        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50,150,100,25);
        usernameLabel.setFont(font);
        removePanel.add(usernameLabel);


        username_TextField = new JTextField();
        username_TextField.setBounds(150,150,165,25);
        username_TextField.setBorder(etched);
        removePanel.add(username_TextField);


        //--------------------BUTTONS-----------------------------/
        //Defining the Back Navigation Button
        JButton btnBack = new JButton("Back");
        btnBack.setFont(font);
        btnBack.setBounds(0,5,50,30);
        btnBack.setBorder(etched);
        btnBack.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    Admin_Dashboard back = new Admin_Dashboard();
                    back.adminDashFrame.setVisible(true);
                    removeFrame.setVisible(false);
                }
            });
        removePanel.add(btnBack);

        //Defining Remove Doctor button
        JButton btnRemove = new JButton("Remove Doctor");
        btnRemove.setBorder(etched);
        btnRemove.setBounds(150,200,100,40);
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int doctorid = Integer.parseInt(username_TextField.getText());

                //Remove or Delete Doctor
                final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
                final String USERNAME = "LogIN";
                final String PASSWORD = "Programming58";

                try{
                    Connection connBookApp = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    // Connected to database successfully...

                    Statement stmt = connBookApp.createStatement();
                    String sql = "DELETE FROM Doctor WHERE Userid=?";
                    PreparedStatement preparedStatement = connBookApp.prepareStatement(sql);
                    preparedStatement.setInt(1, doctorid);

                    //Insert row into the table
                    int deletedRows = preparedStatement.executeUpdate();
                    if (deletedRows > 0) {
                        JOptionPane.showMessageDialog(null,"Doctor Removed");
                      }
                        

                    stmt.close();
                    connBookApp.close();
                }catch(Exception c){
                    c.printStackTrace();
                }
                
            }
        });
        removePanel.add(btnRemove);

        removeFrame.setVisible(true);
    }

}




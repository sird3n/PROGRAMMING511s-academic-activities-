package PRG611S.LABS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Lab03_A {
public static JPanel StudentDetails_Panel;
public static JFrame StudentDetails_Frame;
public static JLabel studentNo_Label, marks_Label, getGrade_Label;
public static JTextField studentNo_Text, marks_Text;


    public static void main(String[] args) {

        //Defining the Frame and Panel
        StudentDetails_Frame = new JFrame("Student Details");
        StudentDetails_Panel = new JPanel();
        StudentDetails_Frame.setSize(600,500);
        StudentDetails_Panel.setBackground(Color.PINK);
        StudentDetails_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StudentDetails_Frame.add(StudentDetails_Panel);
        StudentDetails_Panel.setLayout(null);

        //Defining the student number label
        studentNo_Label = new JLabel("Student No:");
        studentNo_Label.setBounds(100,100,500,50);
        StudentDetails_Panel.add(studentNo_Label);

        //Defining the student number text field
        studentNo_Text = new JTextField(9);
        studentNo_Text.setBounds(200,110,200,30);
        StudentDetails_Panel.add(studentNo_Text);

        //defining the marks label
        marks_Label = new JLabel("Mark:");
        marks_Label.setBounds(130,150,500,50);
        StudentDetails_Panel.add(marks_Label);

        //Defining the marks text field
        marks_Text = new JTextField(9);
        marks_Text.setBounds(200,160,200,30);
        StudentDetails_Panel.add(marks_Text);

        //Defining a label to tell the user where to click
        getGrade_Label = new JLabel("Get Your Mark:");
        getGrade_Label.setBounds(250,230,500,50);
        StudentDetails_Panel.add(getGrade_Label);



        //Defining the OK button
        JButton btn_ok = new JButton("OK");
        btn_ok.setBounds(150,300,80,30);
        btn_ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String grade = "";
                int studentNo = Integer.parseInt(studentNo_Text.getText());
                int mark = Integer.parseInt(marks_Text.getText());

                //DATABASE CONNECTION
                final String DB_URL = "jdbc:sqlserver://.\\sirden_server;databaseName=StudentMarks";

                try{
                    Connection connAddMark = DriverManager.getConnection(DB_URL);
                    // Connected to database successfully...

                    Statement stmt = connAddMark.createStatement();
                    String sql = "INSERT INTO StdtMarks VALUES(?,?)";
                    PreparedStatement preparedStatement = connAddMark.prepareStatement(sql);
                    preparedStatement.setInt(1, studentNo);
                    preparedStatement.setInt(2, mark);

                    //Insert row into the table
                    int addedRows = preparedStatement.executeUpdate();
                    if (addedRows > 0) {
                        JOptionPane.showMessageDialog(null,"Data Saved Successfully!");
                      }
                        

                    stmt.close();
                    connAddMark.close();
                }catch(Exception c){
                    c.printStackTrace();
                }






                //Determining the Grade
                if(mark >= 75 && mark <= 100){
                    grade = "Distinction";
                } else if (mark >= 70 && mark <= 74) {
                    grade = "Merit";
                }else if(mark >= 60 && mark <= 69){
                    grade = "Credit";
                }else if(mark >= 50 && mark <= 59){
                    grade = "Pass";
                } else if (mark >= 0 && mark <= 49) {
                    grade = "Fail";
                }else{
                    grade = "Out of Range!";
                }

                JOptionPane.showMessageDialog( null, "Your Grade is: "+grade+"","Grade",JOptionPane.PLAIN_MESSAGE);
            }
        });
        StudentDetails_Panel.add(btn_ok);

        //Defining the Cancel button
        JButton btn_cancel = new JButton("Cancel");
        btn_cancel.setBounds(360,300,80,30);
        btn_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        StudentDetails_Panel.add(btn_cancel);

        //Setting the Frame visible
        StudentDetails_Frame.setVisible(true);
    }
}
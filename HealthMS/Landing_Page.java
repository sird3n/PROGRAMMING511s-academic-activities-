package HealthMS;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Landing_Page {

    //----------------LABELS & FRAME------------//
    public static JLabel pageHeader1;
    public static JLabel pageHeader2;
    public static JLabel pageHeader3;

    public static JLabel regGuide;

    public static JFrame pageFrame;

    public static JPanel pagePanel;


    //---------------FONT & BORDER---------//
    public static Font font;
    public static Font font1;
    public static Font font2;
    public static Font font3;

    public static Font btnFont;
    public static Border etched;


    public static void main(String[] args) {

        //Defining Font object
        font1 = new Font(Font.SANS_SERIF,Font.BOLD, 42);
        font2 = new Font(Font.SANS_SERIF,Font.BOLD, 28);
        font3 = new Font(Font.SANS_SERIF,Font.BOLD, 62);
        btnFont = new Font(Font.SANS_SERIF,Font.BOLD, 15);
        btnFont = new Font(Font.SANS_SERIF,Font.PLAIN, 15);



        //Defining PANEL & FRAME
        pagePanel = new JPanel();
        pageFrame = new JFrame("HOME PAGE");
        pageFrame.setSize(1200,1000);
        pagePanel.setBackground(Color.pink);
        pageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pageFrame.add(pagePanel);
        pagePanel.setLayout(null);



        //DEFINING LABELS
        pageHeader1 = new JLabel("Welcome");
        pageHeader1.setBounds(450,150,500,50);
        pageHeader1.setFont(font1);
        pagePanel.add(pageHeader1);


        pageHeader2 = new JLabel("To");
        pageHeader2.setBounds(520,300,500,50);
        pageHeader2.setFont(font2);
        pagePanel.add(pageHeader2);


        pageHeader3 = new JLabel("Hospital Management System");
        pageHeader3.setBounds(150,400,1000,100);
        pageHeader3.setFont(font3);
        pagePanel.add(pageHeader3);


        //Creating and Defining the Login button
        JButton btnLogin = new JButton("Log in");
        btnLogin.setBounds(950,20,80,50);
        btnLogin.setBackground(Color.gray);
        btnLogin.setFont(btnFont);
        btnLogin.setBorder(etched);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogIn logIn = new LogIn();
                pageFrame.setVisible(false);
                JOptionPane.showMessageDialog(null,"Choose UserType [1]Admin [2]Doctor [3]Patient");
                logIn.LogIn();
            }
        });
        pagePanel.add(btnLogin);

        //Creating and Defining the Registration button
        JButton btnReg = new JButton("Register");
        btnReg.setBounds(1050,20,80,50);
        btnReg.setBackground(Color.gray);
        btnLogin.setFont(btnFont);
        btnReg.setBorder(etched);
        btnReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PatientReg pReg = new PatientReg();
                pReg.Patient_Reg();
                pageFrame.setVisible(false);
            }
        });
        pagePanel.add(btnReg);

        pageFrame.setVisible(true);        
    }
}

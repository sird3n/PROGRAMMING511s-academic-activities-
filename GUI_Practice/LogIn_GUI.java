package GUI_Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn_GUI implements ActionListener {


    static private JPanel LogIn_panel;
    static private JFrame LogIn_frame;
    //static private JFrame User_Frame;
    static private JTextField userText;
    static private JPasswordField passwordText;
    static private JLabel userLabel;
    static private JLabel passwordLabel;
    static private JLabel success;




    public static void main(String[] args) {
//****************************************************************************************************************
        //Creating PANEL object
        LogIn_panel = new JPanel();
        //Defining panel object
        LogIn_panel.setLayout(null);

        //Creating FRAME object
        LogIn_frame = new JFrame();
        //Defining our frame object
        LogIn_frame.setSize(400, 250);
        LogIn_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogIn_frame.setTitle("Log In");
        LogIn_frame.add(LogIn_panel);

        //Creating LABEL object
        userLabel = new JLabel("Username");
        //Defining user-label object
        userLabel.setBounds(10, 20, 80, 25);
        LogIn_panel.add(userLabel);

        passwordLabel = new JLabel("Password");
        //Defining password-Label object
        passwordLabel.setBounds(10,50,80,25);
        LogIn_panel.add(passwordLabel);

        success = new JLabel("");
        success.setBounds(100,110,300,25);
        LogIn_panel.add(success);

        //Creating TEXT-FIELD object
        userText = new JTextField(20);
        //Defining text-field object
        userText.setBounds(100,20,165,25);
        LogIn_panel.add(userText);

        //Creating PASSWORD-FIELD field
        passwordText = new JPasswordField();
        //Defining password-text object
        passwordText.setBounds(100, 50, 165,25);
        LogIn_panel.add(passwordText);

        //Creating BUTTON object
        JButton button = new JButton("LogIn");
        //Defining button object
        button.setBounds(100,80,80,25);
        button.setBackground(Color.WHITE);
        button.addActionListener(new LogIn_GUI());
        LogIn_panel.add(button);

        LogIn_frame.setVisible(false);
       //*****************************************************************************************************
        //User_frame = new JFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText() ;
        String password = passwordText.getText();
        System.out.println(user+", "+password);

        if(user.equals("Den") && password.equals("Programming58")){
            success.setText("Log In successful!");

        }else {
            success.setText("");
        }
    }
}

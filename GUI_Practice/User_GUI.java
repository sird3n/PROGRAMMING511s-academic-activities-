package GUI_Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_GUI implements ActionListener {


    static private JPanel User_panel;
    static private JFrame User_frame;

    static private JTextField userType;
    static private JLabel uLabel;
    static private JLabel success;




    public static void main(String[] args) {
//****************************************************************************************************************
        //Creating PANEL object
        User_panel = new JPanel();
        //Defining panel object
        User_panel.setLayout(null);

        //Creating FRAME object
        User_frame = new JFrame();
        //Defining our frame object
        User_frame.setSize(400, 250);
        User_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        User_frame.setTitle("Log In");
        User_frame.add(User_panel);

        //Creating LABEL object
        uLabel = new JLabel();
        uLabel.setText("");
        System.out.println("******************** \n Choose User Type: "+"\n"+"1. Admin"+"\n"+"2. Doctor"+"\n"+"3. Patient");
        //Defining user-label object
        uLabel.setBounds(10, 20, 300, 100);
        User_panel.add(uLabel);


        //Creating TEXT-FIELD object
        userType = new JTextField(20);
        //Defining text-field object
        userType.setBounds(100,100,165,25);
        User_panel.add(userType);


        success = new JLabel("");
        success.setBounds(100,180,300,25);
        User_panel.add(success);


        //Creating BUTTON object
        JButton button_logIn = new JButton("LogIn");
        //Defining button object
        button_logIn.setBounds(100,150,80,25);
        button_logIn.setBackground(Color.WHITE);
        button_logIn.addActionListener(new User_GUI());
        User_panel.add(button_logIn);


        User_frame.setVisible(true);
        //*****************************************************************************************************

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userType.getText() ;

        if(user.equals("Admin")){
           success.setText("Welcome "+user);

        }else{
           success.setText("");
        }
    }
}

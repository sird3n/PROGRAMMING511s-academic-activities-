package PRG611S.LABS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab03_B {
    public static JPanel CarDetails_Panel;
    public static JFrame CarDetails_Frame;
    public static JLabel CarName_Label, CarColor_Label, CarOwner_Label, Amount_Label;
    public static JTextField CarName_Text, CarColor_Text, CarOwner_Text, Amount_Text;


    public static void main(String[] args) {

        //Defining the Frame and Panel
        CarDetails_Frame = new JFrame("Car Details");
        CarDetails_Panel = new JPanel();
        CarDetails_Frame.setSize(600,500);
        CarDetails_Panel.setBackground(Color.CYAN);
        CarDetails_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CarDetails_Frame.add(CarDetails_Panel);
        CarDetails_Panel.setLayout(null);

        //Defining the student number label
        CarName_Label = new JLabel("Car");
        CarName_Label.setBounds(100,100,500,50);
        CarDetails_Panel.add(CarName_Label);

        //Defining the student number text field
        CarName_Text = new JTextField();
        CarName_Text.setBounds(200,110,200,30);
        CarDetails_Panel.add(CarName_Text);

        //defining the marks label
        CarColor_Label = new JLabel("Color");
        CarColor_Label.setBounds(100,150,500,50);
        CarDetails_Panel.add(CarColor_Label);

        //Defining the marks text field
        CarColor_Text = new JTextField();
        CarColor_Text.setBounds(200,160,200,30);
        CarDetails_Panel.add(CarColor_Text);

        //Defining the Car owner Label
        CarOwner_Label = new JLabel("Owner");
        CarOwner_Label.setBounds(100,200,500,50);
        CarDetails_Panel.add(CarOwner_Label);

        //Defining the Car owner text field
        CarOwner_Text = new JTextField();
        CarOwner_Text.setBounds(200,210,200,30);
        CarDetails_Panel.add(CarOwner_Text);

        //Defining the Car Amount Label
        Amount_Label = new JLabel("Amount :");
        Amount_Label.setBounds(100,250,500,50);
        CarDetails_Panel.add(Amount_Label);

        //Defining the Car Amount text field
        Amount_Text = new JTextField();
        Amount_Text.setBounds(200,260,200,30);
        CarDetails_Panel.add(Amount_Text);

        //Defining the Enter button
        JButton btn_enter = new JButton("Enter");
        btn_enter.setBounds(150,400,80,30);
        btn_enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String carName = CarName_Text.getText();
                String Color = CarColor_Text.getText();
                String Owner = CarOwner_Text.getText();
                int amount = Integer.parseInt(Amount_Text.getText());

                JOptionPane.showMessageDialog( null, "The Amount is: "+amount+"","Car Amount",JOptionPane.PLAIN_MESSAGE);
            }
        });
        CarDetails_Panel.add(btn_enter);

        //Defining the Exit button
        JButton btn_exit = new JButton("Exit");
        btn_exit.setBounds(360,400,80,30);
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        CarDetails_Panel.add(btn_exit);

        //Setting the frame visible
        CarDetails_Frame.setVisible(true);
    }
}

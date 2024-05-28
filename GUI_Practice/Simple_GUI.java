package GUI_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple_GUI implements ActionListener {
    //Initializing count
    private int count = 0;

    private JLabel label;
    private JPanel panel;
    private JFrame frame;

    public Simple_GUI(){
        //Creating A FRAME OBJECT
        frame = new JFrame();

        //Creating A BUTTON OBJECT
        JButton button = new JButton("CLick Me");
        button.addActionListener(this);
        label = new JLabel("Number OF Clicks: 0");

        //Creating A PANEL
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        //DESIGNING our Frame OBJECT
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Simple_GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: "+ count);
        if(count == 15){
            label.setText("Stoppp!!! Im tired!");

        }

    }
}

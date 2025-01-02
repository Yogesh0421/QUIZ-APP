import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    JButton enter,exit;
    JTextField tfname;

    Login(){

        getContentPane().setBackground(Color.BLACK);

        setLayout(null);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("image/quz2.jpg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading = new JLabel("Brilliant Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30 , 144, 254));
        add(heading);

        JLabel nameJLabel = new JLabel("Enter your Name");
        nameJLabel.setBounds(810, 140, 300, 20);
        nameJLabel.setFont(new Font("Mangolian Baiti",Font.BOLD,18));
        nameJLabel.setForeground(new Color(30 , 144, 254));
        add(nameJLabel);

        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        enter = new JButton("Enter");
        enter.setBounds(735, 270, 120, 25);
        enter.setBackground(new Color(130,144,254));
        enter.addActionListener(this);
        add(enter);

        exit = new JButton("Exit");
        exit.setBounds(915, 270, 120, 25);
        exit.setBackground(new Color(130,144,254));
        exit.addActionListener(this);
        add(exit);


        setSize(1200, 500);
        setLocation(180,150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if ( ae.getSource() == enter) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if (ae.getSource() == exit) {
            setVisible(false);
        }
        
    }

    public static void main(String[] args) {
        new Login();
    }

    
   
}

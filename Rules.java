
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Rules extends JFrame implements ActionListener{

    JButton start,back;

    String name;
    Rules(String name){

        this.name = name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " To Brilliant Minds ");
        heading.setBounds(180, 20, 700, 45);
        heading.setFont(new Font("Elephant",Font.BOLD,28));
        heading.setForeground(new Color(30 , 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 450);
        rules.setFont(new Font("Tahoma",Font.PLAIN,18));
        rules.setForeground(Color.WHITE);
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);

        start = new JButton("Start");
        start.setBounds(230, 520, 120, 25);
        start.setBackground(new Color(130,144,254));
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(400, 520, 120, 25);
        back.setBackground(new Color(130,144,254));
        back.addActionListener(this);
        add(back);



        setSize(800, 650);
        setLocation(350,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start){
            setVisible(false);
            new Quiz1(name);
        }else {
            setVisible(false);
            new Login();
        }
        
    }  
    public static void main(String[] args) {
        new Rules("User");
    }
    
     
}

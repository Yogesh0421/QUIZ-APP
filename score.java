import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener {

    JButton submit,round2;

    score(String name, int score){
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.BLACK);
       
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("image/quz1.jpg"));
        
        JLabel image = new JLabel(il);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel qno = new JLabel("Thank you "+name+" for Playing");
        qno.setBounds(145,30,700,30);
        qno.setFont(new Font("Tahoma",Font.BOLD,26));
        qno.setBackground(Color.BLACK);
        qno.setForeground(Color.WHITE);
        add(qno);

        JLabel scoreJLabel = new JLabel("Your score is "+ score);
        scoreJLabel.setBounds(350,200,300,30);
        scoreJLabel.setFont(new Font("Tahoma",Font.BOLD,26));
        scoreJLabel.setBackground(Color.BLACK);
        scoreJLabel.setForeground(Color.WHITE);
        add(scoreJLabel);

        submit = new JButton("Play Again");
        submit.setBounds(350, 270, 150, 30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        round2 = new JButton("Next Round");
        round2.setBounds(520, 270, 150, 30);
        round2.setFont(new Font("Tahoma",Font.PLAIN,22));
        round2.setBackground(new Color(30,144,255));
        round2.setForeground(Color.WHITE);
        round2.addActionListener(this);
        add(round2);

        setVisible(true);
    }
    public static void main(String[] args) {
        new score("user",0);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==  submit ){
            setVisible(false);
            new Login();
        }else if(e.getSource() == round2){
            new quiz2("user");
        }
        
        
    }
}

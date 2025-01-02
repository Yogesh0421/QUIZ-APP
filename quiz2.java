import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quiz2 extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userAnswers[][] = new String[10][1];

    JLabel qno, question;
    JRadioButton opt1, opt2 , opt3, opt4;
    ButtonGroup group;
    JButton next, lifeline, submit;

    public static int Timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    quiz2(String name){

        this.name = name;

        setBounds(0, 0, 1400, 830);
        getContentPane().setBackground(Color.BLACK);
       
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("image/quz1.jpg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,1400,330);
        add(image);

        qno = new JLabel();
        qno.setBounds(100,350,50,30);
        qno.setFont(new Font("Tahoma",Font.BOLD,24));
        qno.setBackground(Color.BLACK);
        qno.setForeground(Color.WHITE);
        add(qno);

        question = new JLabel();
        question.setBounds(150, 350, 900, 30);
        question.setBackground(Color.BLACK);
        question.setForeground(Color.WHITE);
        question.setFont(new Font("Arial",Font.BOLD,24));
        add(question);

        questions[0][0] = "Who invented java Programming";
        questions[0][1] = "Guido Van ROssum";
        questions[0][2] = "James Gosling";
        questions[0][3] = "Dennis Ritchie";
        questions[0][4] = "Bjarne Stroustrup";

        questions[1][0] = "Which of the following type does not returm any value";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "What Is a extension of java Code";
        questions[2][1] = ".js";
        questions[2][2] = ".txt";
        questions[2][3] = ".class";
        questions[2][4] = ".java";

        questions[3][0] = "Which of these are selection Statement?";
        questions[3][1] = "if()";
        questions[3][2] = "for()";
        questions[3][3] = "continue";
        questions[3][4] = "break";

        questions[4][0] = "A method that does not return any value";
        questions[4][1] = "int";
        questions[4][2] = "float";
        questions[4][3] = "void";
        questions[4][4] = "double";

        questions[5][0] = "which of the following is a method having same name as it's class?";
        questions[5][1] = "finalize";
        questions[5][2] = "delete";
        questions[5][3] = "class";
        questions[5][4] = "constructor";

        questions[6][0] = "Which method can be defined only once in a program?";
        questions[6][1] = "main method";
        questions[6][2] = "finalize method";
        questions[6][3] = "static method";
        questions[6][4] = "private method";

        questions[7][0] = "which of these values can a boolean variable contain?";
        questions[7][1] = "True & False";
        questions[7][2] = "0 & 1";
        questions[7][3] = "Any integer value";
        questions[7][4] = "true";

        questions[8][0] = "Which line is a valid declaration of a boolean?";
        questions[8][1] = "boolean b1 = 1";
        questions[8][2] = "boolean b1 = 'false' ";
        questions[8][3] = "boolean b1 = false ";
        questions[8][4] = "boolean b1 = 'true' ";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

////////////////////////////////////////////////////////////
//Find below the Answers Array of the above Questions
////////////////////////////////////////////////////////////	
        
        answers[0][1] = "James Gosling";
        answers[1][1] = "int";
        answers[2][1] = "java";
        answers[3][1] = "if()";
        answers[4][1] = "void";
        answers[5][1] = "constructor";
        answers[6][1] = "main method";
        answers[7][1] = "True & False";
        answers[8][1] = "boolean b1 = false";
        answers[9][1] = "Bytecode is executed by JVM";

        opt1 = new JRadioButton();
        opt1.setBounds(160, 450, 700, 30);
        opt1.setBackground(Color.BLACK);
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(160, 485, 700, 30);
        opt2.setBackground(Color.BLACK);
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(160, 520, 700, 30);
        opt3.setBackground(Color.BLACK);
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(160, 555, 700, 30);
        opt4.setBackground(Color.BLACK);
        opt4.setForeground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);

        group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

        next = new JButton("Next");
        next.setBounds(1100, 480, 200, 30);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("Quit");
        lifeline.setBounds(1100, 520, 200, 30);
        lifeline.setFont(new Font("Tahoma",Font.PLAIN,22));
        lifeline.setBackground(new Color(30,144,255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1100, 560, 200, 30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (group.getSelection() == null) {
                userAnswers[count][0] = "";
            }else{
                userAnswers[count][0] = group.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);

        } else if(e.getSource() == lifeline) {
            
            setVisible(false);
            new score(name, 0);
            
        }else if (e.getSource() == submit) {
            if (group.getSelection() == null) {
                userAnswers[count][0] = "";
            }else{
                userAnswers[count][0] = group.getSelection().getActionCommand();
            }

            for (int i = 0; i < userAnswers.length; i++) {
                if (userAnswers[i][0].equals(answers[i][1])) {
                    score += 10;
                }
            }
            setVisible(false);
            new score(name , score);

        }
        
    }

    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + Timer + " Seconds";//15
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Tahoma",Font.PLAIN,20));

        if(Timer>0){
            g.drawString(time, 1100, 450);
        }else{
            g.drawString("Times UP!!", 1100, 450);
            
        }

        Timer--;

        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            Timer = 15;
        }else if(Timer<0){
            Timer = 15;

            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if (count == 9) {
                
                if (group.getSelection() == null) {
                    userAnswers[count][0] = "";
                }else{
                    userAnswers[count][0] = group.getSelection().getActionCommand();
                }

                for (int i = 0; i < userAnswers.length; i++) {
                    if (userAnswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    }
                }
                setVisible(false);
                new score(name , score);

            }else{
                
                if (group.getSelection() == null) {
                    userAnswers[count][0] = "";
                }else{
                    userAnswers[count][0] = group.getSelection().getActionCommand();
                }
                 count++;
                 start(count);
            
                }

           
        }
    }

  

    public void start(int count){
        qno.setText(" " +(count + 1) + "." );
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        group.clearSelection();
    }
    public static void main(String[] args) {
        new quiz2("  ");
    }
}

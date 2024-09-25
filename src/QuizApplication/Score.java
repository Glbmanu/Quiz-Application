package QuizApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score(String name, int score){
        setBounds(250,50,700,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = il.getImage().getScaledInstance(400,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,300,400,250);
        add(image);

        JLabel heading = new JLabel("ThankYou "+ name + " for Playing Glbian Quiz");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);

        JLabel lblscore = new JLabel("Your Score is "+score);
        lblscore.setBounds(300,200,700,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(lblscore);

       JButton submit = new JButton("Play Again");
        submit.setBounds(300,250,160,40);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}

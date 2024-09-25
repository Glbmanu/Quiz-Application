package QuizApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,Back;
        Rules(String name){
            this.name = name;
            getContentPane().setBackground(Color.CYAN);
            setLayout(null);

            JLabel heading = new JLabel("Welcome " + name + " to GLBian Quiz");
            heading.setBounds(350,20,700,30);
            heading.setFont(new Font("Times New Roman",Font.BOLD,28));
            heading.setForeground(Color.BLACK);
            add(heading);

            JLabel Rules = new JLabel();
            Rules.setBounds(20,70,700,350);
            Rules.setFont(new Font("Tahoma",Font.PLAIN,16));
            Rules.setForeground(Color.BLACK);
            Rules.setText(
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
            add(Rules);

            Back = new JButton("Back");
            Back.setBounds(400,410,70,25);
            Back.setBackground(Color.WHITE);
            Back.setForeground(Color.BLACK);
            Back.addActionListener(this);
            add(Back);

            start = new JButton("Start");
            start.setBounds(600,410,70,25);
            start.setBackground(Color.WHITE);
            start.setForeground(Color.BLACK);
            start.addActionListener(this);
            add(start);
        setSize(1000,500);
        setLocation(200,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
            if (ae.getSource() == start){
                setVisible(false);
                new quiz(name);
            } else {
                setVisible(false);
                new login();
            }
    }
    public static void main(String[] args) {
        new Rules(" ");
    }
}

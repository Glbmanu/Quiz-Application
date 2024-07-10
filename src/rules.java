import javax.swing.*;
import javax.xml.namespace.QName;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {
    String name;
    JButton start,Back;
        rules(String name){
            this.name = name;
            getContentPane().setBackground(Color.CYAN);
            setLayout(null);

            JLabel heading = new JLabel("Welcome " + name + " to GLBian Quiz");
            heading.setBounds(350,20,700,30);
            heading.setFont(new Font("Times New Roman",Font.BOLD,28));
            heading.setForeground(Color.BLACK);
            add(heading);

            JLabel Rules = new JLabel();
            Rules.setBounds(20,20,700,250);
            Rules.setFont(new Font("Tahoma",Font.PLAIN,16));
            Rules.setForeground(Color.BLACK);
            Rules.setText(
                    "<html>"+
                            "1. Tameez se khelo " + "<br><br>" +
                            "2. Cheating nhi krni hai Wrna pell diye jaogey" + "<br><br>"+
                            "3. har Shi Question pe 10 Marks milenegey " + "<br><br>"+
                            "4. Har Question ke upar time chl rha hai dkhte rhna"+
                            "5. Time ke undar submit krna otherwise khud ho jayega"+
                            "</html>"
            );
            add(Rules);

            Back = new JButton("Back");
            Back.setBounds(400,300,70,25);
            Back.setBackground(Color.WHITE);
            Back.setForeground(Color.BLACK);
            Back.addActionListener(this);
            add(Back);

            start = new JButton("Start");
            start.setBounds(600,300,70,25);
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

            } else {
                setVisible(false);
                new login();
            }
    }
    public static void main(String[] args) {
        new rules(" ");
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JButton rules,Back;
    JTextField tfname;
    login (){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,500,500);
        add(image);

        JLabel heading = new JLabel("GLBian Quiz");
        heading.setBounds(620,60,300,40);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLACK);
        // heading.setForeground(new Color(30,144,254));  COlors in RGB
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(660,140,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,23));
        name.setForeground(Color.BLACK);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(640,170,220,18);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(640,220,70,25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        Back = new JButton("Back");
        Back.setBounds(790,220,70,25);
        Back.setBackground(Color.BLUE);
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);

        setSize(1000,500);
        setLocation(200,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new rules(name);
        } else if (ae.getSource() == Back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new login();
    }
}

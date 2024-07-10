import javax.swing.*;
import java.awt.*;

public class quiz extends JFrame {
    quiz(){
        setBounds(50,0,1240,750);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpeg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,1240,300);
        add(image);


        setVisible(true);
    }
    public static void main(String[] args) {
        new quiz();
    }
}

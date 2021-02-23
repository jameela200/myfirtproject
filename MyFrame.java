import javax.swing.*;
import java.awt.*;

/**
 * Created by HOSHIBA on 12/08/2020.
 */
public class MyFrame {
    public static void main(String[] args) {
        JFrame f= new JFrame("My First Frame");
        JTextField t=new JTextField(20);
        JButton b=new JButton("add");
        b.addActionListener(new Events());
        JLabel l=new JLabel("NAME");
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.add(l);
        f.add(t);
        f.add(b);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}

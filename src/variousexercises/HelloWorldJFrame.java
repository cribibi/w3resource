package variousexercises;

import javax.swing.*;

public class HelloWorldJFrame {
    public static void main(String[] args) {
        JFrame jf1=new JFrame("Graphical hello");
        JLabel jl1 = new JLabel("Hello Bianca!", JLabel.CENTER);
        jf1.add(jl1);
        jf1.setSize(500, 300);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setVisible(true);
    }
}

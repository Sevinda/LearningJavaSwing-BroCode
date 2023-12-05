import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        new MyFrame();
        ImageIcon image = new ImageIcon("b.png");
        Border border = BorderFactory.createLineBorder(Color.RED, 3);

        JLabel label = new JLabel();
        label.setIcon(image);
        label.setText("Bro, do you even code?");
        label.setBorder(border);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.black);
        label.setFont(new Font("Verdana", Font.PLAIN, 20));
        label.setIconTextGap(25);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

//        label.setBounds(50, 50, 350, 350);

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("Java GUI");
//        jFrame.setSize(500,500);
//        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.add(label);
        jFrame.pack();
    }
}
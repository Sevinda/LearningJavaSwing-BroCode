package com.brocode.javaswing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label extends JFrame {
    public Label() {
        JFrame frame = new Frame();
        createLabel(frame);
    }

    private void createLabel(JFrame frame) {
        ImageIcon imageIcon = new ImageIcon("b.png");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
        JLabel label = new JLabel();

        label.setText("How you doing?");
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("Verdana", Font.BOLD, 18));
        label.setForeground(new Color(255,255,255));
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.setBorder(border);

        label.setBounds(50, 50, 350, 350);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        /*
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
         */
    }
}

package com.brocode.javaswing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        createFrame();
    }

    private void createFrame() {
        this.setTitle("Scp");
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(239, 85, 85));
    }
}

package com.brocode.javaswing;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        createFrame();
    }

    private void createFrame() {
        this.setTitle("Scp");
        this.setVisible(true);
        this.setSize(750,750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(null);
//        this.getContentPane().setBackground(new Color(239, 85, 85));
    }
}

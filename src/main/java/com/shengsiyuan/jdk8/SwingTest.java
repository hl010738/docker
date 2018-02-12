package com.shengsiyuan.jdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My JFframe");
        JButton jButton = new JButton("My JButton");

        jButton.addActionListener(e -> {
            System.out.println("Button pressed!");
            System.out.println("Hello world");
        });

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package com.company.Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguagePage {
    public void gridLayoutExample() {
        JFrame frame = new JFrame("Language Choice");
        JButton button, button1, button2, button3, button4, button5;
        button = new JButton("English", new ImageIcon("English.png"));
        button1 = new JButton("Deutsche", new ImageIcon("German.png"));
        button2 = new JButton("Français", new ImageIcon("French.png"));
        button3 = new JButton("Español", new ImageIcon("Spanish.png"));
        button4 = new JButton("中文", new ImageIcon("Chinese.png"));
        button5 = new JButton("Other");
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.setLayout(new GridLayout(2, 3));
        frame.setSize(1500, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrameClass jfc = new JFrameClass();
                jfc.start();
            }
        };
        button.addActionListener(al);
        button1.addActionListener(al);
        button2.addActionListener(al);
        button3.addActionListener(al);
        button4.addActionListener(al);
        button5.addActionListener(al);
    }
}
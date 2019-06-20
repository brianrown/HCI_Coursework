package com.company.Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class JFrameClass {

    private JFrame frame;
    private static GraphicsConfiguration gc;

    public void start() {
        frame = new JFrame(gc);
        addTabs();
        frame.setTitle("Welcome To Buchanan Galleries");
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);
    }

    private void addTabs() {
        JTabbedPane tabbedPane = new JTabbedPane();

        JComponent panel1 = makeTextPanel("Enter Map Here");
        tabbedPane.addTab("Map", panel1);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2 = makeTextPanel("Enter List of all shops here");
        tabbedPane.addTab("List of Shops", panel2);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel3 = makeTextPanel("Enter List of Offers and Deals here");
        tabbedPane.addTab("Offers/Deals",  panel3);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        JComponent panel4 = makeTextPanel("Enter all help information here.");
        tabbedPane.addTab("Help", panel4);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        frame.add(tabbedPane);
    }
    private JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
}
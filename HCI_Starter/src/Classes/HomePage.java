package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomePage {

    private JFrame frame;

    public HomePage(){
        this.frame = new JFrame();
    }
    public void loadPage() {
        JButton button, button1, button2, button3, button4, button5;
        button = new JButton("English", new ImageIcon("D:\\University Work\\Year 2\\HCI_Starter\\src\\Images\\English.png"));
        button1 = new JButton("Deutsche", new ImageIcon("D:\\University Work\\Year 2\\HCI_Starter\\src\\Images\\German.png"));
        button2 = new JButton("Français", new ImageIcon("D:\\University Work\\Year 2\\HCI_Starter\\src\\Images\\French.png"));
        button3 = new JButton("Español", new ImageIcon("D:\\University Work\\Year 2\\HCI_Starter\\src\\Images\\Spanish.png"));
        button4 = new JButton("中文", new ImageIcon("D:\\University Work\\Year 2\\HCI_Starter\\src\\Images\\Chinese.png"));
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

        button.addActionListener(al);
        button1.addActionListener(al);
        button2.addActionListener(al);
        button3.addActionListener(al);
        button4.addActionListener(al);
        button5.addActionListener(al);
    }
    private ActionListener al = e -> {
        MapPage mp = new MapPage();
        mp.loadPage();
        frame.setVisible(false);
    };
}
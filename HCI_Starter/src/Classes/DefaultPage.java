package Classes;

import javax.swing.*;
import java.awt.event.ActionListener;

public class DefaultPage{

    private JFrame frame;

    public DefaultPage(){
        this.frame = new JFrame("Welcome To Buchanan Galleries");
    }
    public void start(){
        JButton button;
        button = new JButton("Touch To Start", new ImageIcon("D:\\University Work\\Year 2\\HCI_Starter\\src\\Images\\Welcome.png"));
        frame.add(button);
        frame.setSize(1500, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        button.addActionListener(al);
    }
    private ActionListener al = e -> {
        HomePage jfc = new HomePage();
        jfc.loadPage();
        frame.setVisible(false);
    };
}

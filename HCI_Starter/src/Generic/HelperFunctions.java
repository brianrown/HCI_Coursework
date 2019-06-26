package Generic;

import Classes.*;

import javax.swing.*;
import java.awt.event.ActionListener;

public class HelperFunctions extends JFrame{
    public void addMenuButtons(JFrame frame, JPanel panel){
        JButton Home = new JButton("Home");
        JButton Map = new JButton("Map");
        JButton Shops = new JButton("Shops");
        JButton Offers = new JButton("Offers");
        JButton Help = new JButton("Help");

        Home.setBounds(0,0,300,100);
        Map.setBounds(300,0,300,100);
        Shops.setBounds(600,0,300,100);
        Offers.setBounds(900,0,300,100);
        Help.setBounds(1200,0,300,100);

        panel.setLayout(null);
        panel.add(Home);
        panel.add(Map);
        panel.add(Shops);
        panel.add(Offers);
        panel.add(Help);

        frame.add(panel);
        frame.setTitle("Welcome To Buchanan Galleries");
        frame.setSize(1500, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Home.addActionListener(al1);
        Map.addActionListener(al2);
        Shops.addActionListener(al3);
        Offers.addActionListener(al4);
        Help.addActionListener(al5);
    }
    private ActionListener al1 = e -> {
        HomePage hp = new HomePage();
        hp.loadPage();
        setVisible(false);
    };
    private ActionListener al2 = e -> {
        MapPage mp = new MapPage();
        mp.loadPage();
        setVisible(false);
    };
    private ActionListener al3 = e -> {
        ShopsPage sp = new ShopsPage();
        sp.loadPage();
        setVisible(false);
    };
    private ActionListener al4 = e -> {
        OffersPage op = new OffersPage();
        op.loadPage();
        setVisible(false);
    };
    private ActionListener al5 = e -> {
        HelpPage hp = new HelpPage();
        hp.loadPage();
        setVisible(false);
    };
}

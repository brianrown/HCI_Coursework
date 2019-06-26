package Classes;

import Generic.HelperFunctions;

import javax.swing.*;

public class OffersPage{
    private JFrame frame;
    private JPanel panel;
    private HelperFunctions hf;

    public OffersPage(){
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.hf = new HelperFunctions();
    }
    public void loadPage(){
        hf.addMenuButtons(frame, panel);
        addComponents();
    }
    private void addComponents(){

    }
}

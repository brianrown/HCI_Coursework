package Classes;

import javax.swing.*;
import Generic.HelperFunctions;

public class MapPage{
    private JFrame frame;
    private JPanel panel;
    private HelperFunctions hf;

    public MapPage(){
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

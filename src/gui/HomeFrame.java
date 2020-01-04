package gui;

import javax.swing.*;

public class HomeFrame extends JFrame {

    private JPanel currPanel;
    public HomeFrame(){
        currPanel = new GreetingPanel();
        currPanel.setLayout(new BoxLayout(currPanel,BoxLayout.Y_AXIS));
        greeting.setAlignmentY(Component.CENTER_ALIGNMENT);

        add(currPanel);
    }
}

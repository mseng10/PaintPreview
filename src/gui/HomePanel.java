package gui;

import javax.swing.*;

public class HomePanel extends JPanel {

    private JLabel greeting;

    public HomePanel(){
        greeting = new JLabel();
        greeting.setText("ha");
        add(greeting);
    }
}

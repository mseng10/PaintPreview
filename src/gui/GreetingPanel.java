package gui;
import javax.swing.*;

public class GreetingPanel extends JPanel {

    private JLabel greeting;

    public GreetingPanel(){
        greeting = new JLabel();
        greeting.setText("Too my darling Emily.");
        add(greeting);
    }
}

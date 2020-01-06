package gui;
import javax.swing.*;
import java.awt.*;

public class GreetingPanel extends JPanel {

    private JLabel greeting;

    public GreetingPanel(){
        greeting = new JLabel();
        greeting.setText("Sup");
        add(greeting);
        this.setBackground(Color.MAGENTA);

    }
}

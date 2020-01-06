package gui;
import javax.swing.*;
import java.awt.*;

public class GreetingPanel extends JPanel {

    private JLabel greeting;

    public GreetingPanel(){
        greeting = new JLabel();
        greeting.setText("Sup");
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setSize(500,500);
        add(greeting);
        this.setBackground(Color.MAGENTA);

    }
}

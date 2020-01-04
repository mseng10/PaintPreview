package gui;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class HomeFrame extends JFrame {

    private JPanel currPanel;
    public HomeFrame(){
        currPanel = new GreetingPanel();
        setLayout(new FlowLayout());
        setBackground(Color.MAGENTA);
        currPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        currPanel.setSize(500,500);
        add(currPanel);
    }

    public void transitionToHome(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }
        catch(InterruptedException e){
            System.out.println("Broken");
        }
        Container contain = getContentPane();
        contain.removeAll();
        currPanel = new HomePanel();
        contain.add(currPanel);
        contain.validate();
        contain.repaint();
    }
}

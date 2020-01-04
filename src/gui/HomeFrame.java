package gui;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class HomeFrame extends JFrame {

    private JPanel currPanel;
    public HomeFrame(){
        currPanel = new GreetingPanel();
        setLayout(new FlowLayout());
        currPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(currPanel);
        try{
            TimeUnit.SECONDS.sleep(3);
        }
        catch(InterruptedException e){
            System.out.println("Broken");
        }
    }
}

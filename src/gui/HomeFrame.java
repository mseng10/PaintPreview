package gui;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class HomeFrame extends JFrame {

    private JPanel currPanel;
    public HomeFrame(){
        currPanel = new GreetingPanel();
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.red);
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

package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HomePanel extends JPanel {

    private JLabel greeting;

    public HomePanel(){
        setBackground(Color.MAGENTA);
        try{
            BufferedImage myPicture = ImageIO.read(new File("images/fishimage.png"));
            greeting = new JLabel(new ImageIcon(myPicture));
            add(greeting);
        }
        catch (IOException poop){
            System.out.println("Error loading image you dumb-ass");
        }

    }
}

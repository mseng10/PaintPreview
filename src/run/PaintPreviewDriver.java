package run;

import gui.HomeFrame;

import javax.swing.*;
import java.awt.*;

public class PaintPreviewDriver {

    public static void main(String[] args){
        HomeFrame base = new HomeFrame();
        base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        base.setSize(1000, 1000);
        base.setVisible(true);
        base.setBackground(Color.red);
        //base.transitionToHome();
    }
}

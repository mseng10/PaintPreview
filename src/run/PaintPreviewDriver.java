package run;

import gui.HomeFrame;

import javax.swing.*;

public class PaintPreviewDriver {

    public static void main(String[] args){
        HomeFrame base = new HomeFrame();
        base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        base.setSize(300, 800);
        base.setVisible(true);
    }
}

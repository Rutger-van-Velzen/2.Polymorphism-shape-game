package org.example;

import javax.swing.*;

public class Window {
   public void initWindow(){
       JFrame frame = new JFrame("Shape game");
       Panel panel = new Panel();

       Action shapeMover = new Action(panel);

       Timer timer = new Timer(15, shapeMover);
       timer.start();

       frame.add(panel);

       frame.setSize(400, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}

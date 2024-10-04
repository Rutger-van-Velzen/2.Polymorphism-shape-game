package org.example;

import javax.swing.*;
import java.awt.*;

public class Window {
   public void initWindow(){
       JFrame frame = new JFrame("Shape game");
       Panel panel = new Panel();

       panel.addGameObject(new GameObject("rectangle", Color.RED, 30, 30, 50, 50));
       panel.addGameObject(new GameObject("oval", Color.BLUE, 100, 100, 50, 50));
       panel.addGameObject(new GameObject("oval", Color.YELLOW, 200, 300, 120, 120));

//       Action shapeMover = new Action(panel);
//
//       Timer timer = new Timer(15, shapeMover);
//       timer.start();

       frame.add(panel);

       frame.setSize(400, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}

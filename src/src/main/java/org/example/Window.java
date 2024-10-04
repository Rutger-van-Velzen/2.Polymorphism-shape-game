package org.example;

import org.example.Shapes.MyCircle;
import org.example.Shapes.MyRectangle;
import org.example.Shapes.MyShapes;
import org.example.Shapes.MySquare;

import javax.swing.*;
import java.awt.*;

public class Window {
   public void initWindow(){
       JFrame frame = new JFrame("Shape game");
       Panel panel = new Panel();

       final MyShapes sq = new MySquare(panel);
       final MyShapes ci = new MyCircle(panel);
       final MyShapes re = new MyRectangle(panel);

       sq.draw();
       System.out.println(sq.getName());
       System.out.println(sq.getNumberOfSides());

       ci.draw();
       System.out.println(ci.getName());
       System.out.println(ci.getNumberOfSides());


       re.draw();
       System.out.println(re.getName());
       System.out.println(re.getNumberOfSides());

//       panel.addGameObject(new GameObject("rectangle", Color.RED, 30, 30, 50, 50));
//       panel.addGameObject(new GameObject("oval", Color.BLUE, 100, 100, 50, 50));
//       panel.addGameObject(new GameObject("oval", Color.YELLOW, 200, 300, 120, 120));




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

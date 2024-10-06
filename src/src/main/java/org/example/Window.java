package org.example;

import org.example.Shapes.*;

import javax.swing.*;

public class Window {
   public void initWindow(){

       final MySquare sq = new MySquare();
       final MyCircle ci = new MyCircle();
       final MyRectangle re = new MyRectangle();
       final MyOval ov = new MyOval();

       sq.draw();
       ci.draw();
       re.draw();
       ov.draw();


       JFrame frame = new JFrame("Draw Shapes");
       frame.add(Panel.getInstance());
       frame.setSize(400, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}

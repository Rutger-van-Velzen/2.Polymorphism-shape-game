package org.example;

import org.example.Shapes.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Window {
   public void initWindow(){

       final MyShapes sq = new MySquare();
       final MyShapes ci = new MyCircle();
       final MyShapes re = new MyRectangle();
       final MyShapes ov = new MyOval();

       List<MyShapes> myShapesList = new ArrayList<>();
       myShapesList.add(sq);
       myShapesList.add(ci);
       myShapesList.add(re);
       myShapesList.add(ov);

       myShapesList.forEach(myShapes -> {
           myShapes.draw();
       });



//       Action shapeMover = new Action();
//
//       Timer timer = new Timer(15, shapeMover);
//       timer.start();

       JFrame frame = new JFrame("Draw Shapes");

       frame.add(Panel.getInstance());

       frame.setSize(400, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}

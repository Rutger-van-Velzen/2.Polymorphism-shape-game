package org.example.Shapes;

import org.example.DrawInstructions;
import org.example.Panel;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyCircle{
    public void draw() {
        final DrawInstructions drawInstructions = new DrawInstructions();
        drawInstructions.setColor(Color.BLUE);
        drawInstructions.setShape(new Ellipse2D.Double(100, 100, 50, 50));

        Panel.addDrawInstructions(drawInstructions);
    }

}

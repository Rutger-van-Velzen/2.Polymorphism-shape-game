package org.example.Shapes;

import org.example.DrawInstructions;
import org.example.Panel;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyOval {

    public void draw() {
        final DrawInstructions drawInstructions = new DrawInstructions();
        drawInstructions.setColor(Color.PINK);
        drawInstructions.setShape(new Ellipse2D.Double(300, 290, 50, 70));

        Panel.addDrawInstructions(drawInstructions);
    }
}

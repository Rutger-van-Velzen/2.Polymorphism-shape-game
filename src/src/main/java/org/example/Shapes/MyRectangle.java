package org.example.Shapes;

import org.example.DrawInstructions;
import org.example.Panel;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MyRectangle {

    public void draw() {
        final DrawInstructions drawInstructions = new DrawInstructions();
        drawInstructions.setColor(Color.GREEN);
        drawInstructions.setShape(new Rectangle2D.Double(250, 100, 100, 50));

        Panel.addDrawInstructions(drawInstructions);
    }
}

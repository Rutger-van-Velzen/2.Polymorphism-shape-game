package org.example.Shapes;

import org.example.DrawInstructions;
import org.example.Panel;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MySquare {

    public void draw() {
        final DrawInstructions drawInstructions = new DrawInstructions();
        drawInstructions.setColor(Color.RED);
        drawInstructions.setShape(new Rectangle2D.Double(100, 300, 50, 50));

        Panel.addDrawInstructions(drawInstructions);
    }
}

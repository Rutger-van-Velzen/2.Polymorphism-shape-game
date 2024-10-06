package org.example.Shapes;

import org.example.DrawInstructions;
import org.example.Panel;

import java.awt.*;

public class MySquare implements MyShapes{

    @Override
    public void draw() {
        Panel.addDrawInstructions(new DrawInstructions("rectangle", Color.RED, 100, 300, 50, 50));
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }
}

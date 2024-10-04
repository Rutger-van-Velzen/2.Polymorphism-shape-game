package org.example.Shapes;

import org.example.GameObject;
import org.example.Panel;

import java.awt.*;

public class MySquare implements MyShapes{
    private Panel panel;

    public MySquare(Panel panel){
        this.panel = panel;
    }

    @Override
    public void draw() {
        panel.addGameObject(new GameObject("rectangle", Color.RED, 100, 300, 50, 50));
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

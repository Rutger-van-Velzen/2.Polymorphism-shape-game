package org.example.Shapes;

import org.example.GameObject;
import org.example.Panel;

import java.awt.*;

public class MyCircle implements MyShapes{
    private Panel panel;

    public MyCircle(Panel panel){
        this.panel = panel;
    }

    @Override
    public void draw() {
        panel.addGameObject(new GameObject("oval", Color.BLUE, 100, 100, 50, 50));
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public int getNumberOfSides() {
        return 0;
    }
}

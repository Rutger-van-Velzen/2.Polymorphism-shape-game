package org.example.Shapes;

import org.example.GameObject;
import org.example.Panel;

import java.awt.*;

public class MyRectangle implements MyShapes{
    private Panel panel;

    public MyRectangle(Panel panel){
        this.panel = panel;
    }

    @Override
    public void draw() {
        panel.addGameObject(new GameObject("rectangle", Color.GREEN, 250, 100, 100, 50));
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }
}

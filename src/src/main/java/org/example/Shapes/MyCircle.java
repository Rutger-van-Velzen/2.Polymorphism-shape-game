package org.example.Shapes;

import org.example.GameObject;
import org.example.Panel;

import java.awt.*;

public class MyCircle implements MyShapes{

    @Override
    public void draw() {
        Panel.addGameObject(new GameObject("oval", Color.BLUE, 100, 100, 50, 50));
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

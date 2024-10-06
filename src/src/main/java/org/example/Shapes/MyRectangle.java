package org.example.Shapes;

import org.example.GameObject;
import org.example.Panel;

import java.awt.*;

public class MyRectangle implements MyShapes{

    @Override
    public void draw() {
        Panel.addGameObject(new GameObject("rectangle", Color.GREEN, 250, 100, 100, 50));
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

package org.example.Shapes;

import org.example.GameObject;
import org.example.Panel;

import java.awt.*;

public class MySquare implements MyShapes{

    @Override
    public void draw() {
        Panel.addGameObject(new GameObject("rectangle", Color.RED, 100, 300, 50, 50));
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

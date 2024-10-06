package org.example.Shapes;

import org.example.GameObject;
import org.example.Panel;

import java.awt.*;

public class MyOval implements MyShapes{

    @Override
    public void draw() {
        Panel.addGameObject(new GameObject("oval", Color.PINK, 300, 290, 50, 70));
    }

    @Override
    public String getName() {
        return "Oval";
    }

    @Override
    public int getNumberOfSides() {
        return 0;
    }
}

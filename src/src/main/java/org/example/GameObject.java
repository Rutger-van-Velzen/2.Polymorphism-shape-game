package org.example;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class GameObject {
    private final Shape shape;
    private final Color color;

    public GameObject(String shape, Color color, int x, int y, int w, int h){
        this.color = color;

        if(shape.equalsIgnoreCase("rectangle")){
            this.shape = new Rectangle2D.Double(x, y, w, h);
        } else if(shape.equalsIgnoreCase("oval")){
            this.shape = new Ellipse2D.Double(x, y, w, h);
        } else {
            throw new RuntimeException("Unknown shape: " + shape);
        }
    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public void setPosition(int x, int y){
        ((Rectangle2D) this.shape).add(x, y);
    }
}

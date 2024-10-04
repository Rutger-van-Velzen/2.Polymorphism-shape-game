package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Panel extends JPanel {

    private List<GameObject> gameObjects = new ArrayList<>();

    public void updatePositions() {
//        gameObjects.forEach(gameObject -> {
//            gameObject.setPosition();
//        });
//
//        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        gameObjects.forEach(gameObject -> {
            g2d.setColor(gameObject.getColor());
            g2d.fill(gameObject.getShape());
        });
    }


    public void addGameObject(GameObject gameObject){
        gameObjects.add(gameObject);
    }
}
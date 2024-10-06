package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Panel extends JPanel {
    private static final Panel PANEL = new Panel();
    private static final List<DrawInstructions> DRAW_INSTRUCTIONS = new ArrayList<>();

    private Panel(){

    }

    public static Panel getInstance(){
        return PANEL;
    }

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

        DRAW_INSTRUCTIONS.forEach(drawInstructions -> {
            g2d.setColor(drawInstructions.getColor());
            g2d.fill(drawInstructions.getShape());
        });
    }


    public static void addDrawInstructions(DrawInstructions drawInstructions){
        DRAW_INSTRUCTIONS.add(drawInstructions);
    }
}
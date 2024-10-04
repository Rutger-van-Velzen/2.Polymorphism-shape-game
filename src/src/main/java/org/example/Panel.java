package org.example;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    // Position and size of the shapes
    private int circleX = 30, circleY = 30, circleDiameter = 50;
    private int rectX = 100, rectY = 100, rectWidth = 50, rectHeight = 50;

    // Method to update the positions
    public void updatePositions(int circleDeltaX, int circleDeltaY, int rectDeltaX, int rectDeltaY) {
        circleX += circleDeltaX;
        circleY += circleDeltaY;
        rectX += rectDeltaX;
        rectY += rectDeltaY;
        repaint(); // Repaint the panel to show the new positions
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw circle
        g2d.setColor(Color.BLUE);
        g2d.fillOval(circleX, circleY, circleDiameter, circleDiameter);

        // Draw rectangle
        g2d.setColor(Color.GREEN);
        g2d.fillRect(rectX, rectY, rectWidth, rectHeight);
    }
}
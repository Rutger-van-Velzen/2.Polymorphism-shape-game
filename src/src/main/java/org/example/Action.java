package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener {
    private Panel panel;

    public Action(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the positions (move the circle down/right and rectangle up/left)
        panel.updatePositions(1, 1, -1, -1);
    }
}
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
        panel.updatePositions();
    }
}
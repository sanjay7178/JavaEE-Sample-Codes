package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseMotionListernerExample extends Frame implements  MouseMotionListener {
    MouseMotionListernerExample(){
        addMouseMotionListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new MouseMotionListernerExample();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics  g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

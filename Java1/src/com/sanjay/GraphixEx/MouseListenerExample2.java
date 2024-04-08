package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample2 extends Frame implements MouseListener {
    MouseListenerExample2(){
        addMouseListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g  = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MouseListenerExample2();
    }
}

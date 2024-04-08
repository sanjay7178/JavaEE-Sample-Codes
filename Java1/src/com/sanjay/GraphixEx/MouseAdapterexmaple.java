package com.sanjay.GraphixEx;

import java.awt.event.MouseMotionAdapter;

//Java program that handles all mouse events and shows the event name at the center of the window when a mouse event is fired (Use Adapter classes).
public class MouseAdapterexmaple extends MouseMotionAdapter {
    public void mouseDragged(java.awt.event.MouseEvent e) {
        System.out.println("Mouse Dragged");
    }

    public void mouseMoved(java.awt.event.MouseEvent e) {
        System.out.println("Mouse Moved");
    }

    public void mouseClicked(java.awt.event.MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed(java.awt.event.MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(java.awt.event.MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public void mouseEntered(java.awt.event.MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(java.awt.event.MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
        System.out.println("Mouse Wheel Moved");
    }


    public static void main(String[] args) {
        MouseAdapterexmaple m = new MouseAdapterexmaple();
        java.awt.Frame f = new java.awt.Frame("Mouse Adapterexmaple");
        f.add(new java.awt.Canvas());
        f.addMouseMotionListener(m);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
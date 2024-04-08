package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends Frame implements MouseListener {
    Label I;
    MouseListenerExample(){
        addMouseListener(this);
        I = new Label();
        I.setBounds(20,50,100,20);
        add(I);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        I.setText("Mouse Clicked");
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        I.setText("Mouse Pressed");
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        I.setText("Mouse Released");
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        I.setText("Mouse Entered");
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        I.setText("Mouse Exited");
        System.out.println("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}

package com.sanjay.GraphixEx;

import java.awt.*;

public class First extends Frame {
    First(){
        Button b  = new Button("Click Me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        First f = new First();
    }
}

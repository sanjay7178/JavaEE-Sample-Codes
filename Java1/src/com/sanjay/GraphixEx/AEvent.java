package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEvent extends Frame implements ActionListener {
    TextField tf;
    AEvent(){
        tf =  new TextField();
        tf.setBounds(60,50,170,20);
        Button  b  = new Button("Click Me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(tf);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        tf = new TextField("Welcome");
    }

    public static void main(String[] args) {
        new AEvent();
    }
}

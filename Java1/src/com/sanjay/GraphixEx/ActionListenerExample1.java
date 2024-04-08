package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample1 implements ActionListener {
    ActionListenerExample1(){
        Frame f =  new Frame("ActionListener Example");
        final TextField tf  = new TextField();
        tf.setBounds(50,50, 150,20);
        Button b = new Button("Click Me");
        b.setBounds(50,100,60,30);
        b.addActionListener(this);
        f.add(tf);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        ActionListenerExample1 a  = new ActionListenerExample1();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello ");
    }
}

package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerExample extends Frame implements ItemListener {
    Checkbox c1 , c2;
    Label l;
    ItemListenerExample(){
        Frame  f = new Frame();
        l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        c1 = new Checkbox("c++");
        c2  = new Checkbox("java");
        c1.setBounds(100,100,50,50);
        c2.setBounds(100,150,50,50);
        add(c1);
        add(c2);
        add(l);
        c1.addItemListener(this);
        c2.addItemListener(this);
        setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
}

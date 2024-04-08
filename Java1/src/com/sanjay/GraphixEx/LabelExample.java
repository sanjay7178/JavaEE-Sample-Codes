package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class LabelExample extends  Frame implements ActionListener {
    TextField tf ; Label I ; Button b;
    LabelExample(){
        tf = new TextField();
        tf.setBounds(50,50,150,20);
        I = new Label();
        b = new Button("Find IP");
        b.setBounds(50,100,60,30);
        b.addActionListener(this);
        add(tf);
        add(b);add(I);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            I.setText(ip);
        } catch (UnknownHostException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new LabelExample();
    }
}

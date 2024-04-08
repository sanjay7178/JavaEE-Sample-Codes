package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample extends Frame implements ActionListener {
    TextField tf1 ,tf2, tf3;
    Button  b1 ,b2 ;
    TextFieldExample(){
        tf1 =  new TextField();
        tf1.setBounds(50,50,150,20);
        tf2 = new TextField();
        tf2.setBounds(50,100,150,20);
        tf3 = new TextField();
        tf3.setBounds(50,150,150,20);
        b1 = new Button("+");
        b2 = new Button("-");
        b1.setBounds(50,200,50,50);
        b2.setBounds(150,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf1);add(tf2);add(tf3);add(b1);add(b2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        int c = 0;
        if(e.getSource() == b1){
            c = a+b;
        }
        else if(e.getSource() == b2){
            c = a-b;
        }
        tf3.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}

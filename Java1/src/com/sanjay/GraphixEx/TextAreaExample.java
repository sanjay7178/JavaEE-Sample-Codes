package com.sanjay.GraphixEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends Frame implements ActionListener {
    Label I1 ,I2;
    TextArea area;
    TextAreaExample(){
        I1 = new Label();
        I2 = new Label();
        area = new TextArea();
        I1.setBounds(50,50,100,30);
        I2.setBounds(160,50,100,30);
        area.setBounds(20,100,300,300);
        Button b = new Button("Click Me ");
        b.setBounds(100,400,100,30);
        b.addActionListener(this);
        add(I1);add(I2);add(area);add(b);
        setSize(450,450);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String words[] = text.split("\\s");
        I1.setText("Word: "+words.length);
        I2.setText("Characters: "+ text.length());
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}

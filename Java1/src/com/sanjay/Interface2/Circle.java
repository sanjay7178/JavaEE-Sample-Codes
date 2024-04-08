package com.sanjay.Interface2;

import java.util.Scanner;

public class Circle implements Drawable{
//int rad = 4;
Scanner in = new Scanner(System.in);

    @Override
    public void draw() {
        System.out.print("Radius");
        int rad = in.nextInt();
        System.out.println("Area of Circle:"+(22 / 7) * rad * rad);
    }
}

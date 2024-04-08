package com.sanjay.Interface2;

import java.util.Scanner;

public class Rectangle implements Drawable{
//    int len = 3;
//    int bre =  4;

Scanner in = new Scanner(System.in);
    @Override
    public void draw() {
        System.out.print("Lenght");
        int len = in.nextInt();
        System.out.print("Breadth");
        int bre = in.nextInt();
        System.out.println("Area of Rectangle:"+len*bre);
    }
}

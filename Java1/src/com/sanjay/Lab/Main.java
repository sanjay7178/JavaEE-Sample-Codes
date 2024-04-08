package com.sanjay.Lab;
// 1. Write a Java Program to define a class, describe its constructor,
//  overload the Constructors and instantiate its object
public class Main {
//    String s;
    Main(String s){
//        this.s = s;
        System.out.println("My name is "+ s);
    }
    Main(String s , int i){
        System.out.println("My name is "+s+" my age is "+i );
    }
    public static void main (String[] args) {
        Main Object = new Main("Sanjay");
        new Main("Sanjay",18);

    }
}

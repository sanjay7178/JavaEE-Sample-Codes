package com.sanjay.Lab;
//2. Write a Java Program to define a class, define instance methods for setting and
//        Retrieving values of instance variables and instantiate its object
class Main1 {
    String name(String s){
        String name = s;
        return name;
    }
    int age(int i){
        int age =i;
        return age;
    }}
    public class Main2{
    public static void main(String[] args) {
        Main1 object = new Main1();
        System.out.println("My name is "+object.name("sanjay")+" and my age is "+object.age(18));

    }
}

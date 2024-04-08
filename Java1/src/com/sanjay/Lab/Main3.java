package com.sanjay.Lab;
//3. Write a Java Program to define a class, define instance methods and overload them and
//        use them for dynamic method invocation
import java.lang.*;
class Call{
    String name;
    int num;
    int num2;
    void display(String name){
        System.out.println(name);
    }
    void display(int num, int num2){
        System.out.println(num+num2);
    }
}
class Main3{
    public static void main(String[] args) {
        Call obj = new Call();
        obj.display("Sanjay");
        obj.display(12,26);
    }
}
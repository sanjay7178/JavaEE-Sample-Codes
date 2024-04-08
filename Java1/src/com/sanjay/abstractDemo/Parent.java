package com.sanjay.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 33552555;
    }
//abstract Parent();
    //cannot create abstract constructors
    static void hello() {
        System.out.println("Hey How are you");
    }//static methods are allowed
    void normal(){
        System.out.println("This is Normal Method");
    }
    abstract void career();
    abstract void partner();
}

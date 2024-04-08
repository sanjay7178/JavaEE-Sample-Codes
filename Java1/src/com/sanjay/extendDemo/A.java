package com.sanjay.extendDemo;

public interface A {
    //static interface methods should always have a body
    //call via the interface name
    static  void greeting(){
        System.out.println("Hey I am static method");
    }    void fun();
}

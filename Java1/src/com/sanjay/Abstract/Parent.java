package com.sanjay.Abstract;

public abstract class Parent {
    int a ;
    int b;

    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void subtract(int a , int b){
        int e = a - b;
        System.out.println("Addition:"+" "+e);
    }
    void divide(int a , int b){
        int f = a / b;
        System.out.println("Addition:"+" "+f);
    }

    void add(int a , int b){
        int c = a + b;
        System.out.println("Addition:"+" "+c);
    }
    void multiply(int a , int b){
        int d = a * b;
        System.out.println("Addition:"+" "+d);
    }


}

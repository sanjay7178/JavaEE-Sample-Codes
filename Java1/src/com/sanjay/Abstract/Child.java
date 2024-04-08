package com.sanjay.Abstract;

public class Child extends Parent{

    public Child(int a, int b) {
        super(a,b);
    }
    @Override
    public void multiply(int a, int b) {
        super.multiply(a, b);
    }
    @Override
    public void add(int a, int b) {
        super.add(a, b);
    }

    @Override
    void subtract(int a, int b) {
        super.subtract(a, b);
    }

    @Override
    void divide(int a, int b) {
        super.divide(a, b);
    }
}

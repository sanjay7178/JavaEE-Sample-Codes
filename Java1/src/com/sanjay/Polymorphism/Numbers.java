package com.sanjay.Polymorphism;

public class Numbers {
    int sum (int a , int b){
        return a+ b ;
    }
    double sum (double a , int b){
        return a+ b ;
    }
    int sum(int b , int a, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1,2);
        System.out.println(obj.sum(2,3,4));
    }
}

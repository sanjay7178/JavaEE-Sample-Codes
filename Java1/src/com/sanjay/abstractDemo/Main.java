package com.sanjay.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Parent son = new Son(20);
        son.career();
        Parent daughter = new Daughter(22);
        daughter.career();
//        Parent mom = new Parent() ;//cannot create objects fpr abstract classes
    Parent.hello();
    son.normal();
        int value = son.VALUE;
        System.out.println(value);
    }
}

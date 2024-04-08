package com.sanjay.Problems;

interface Printable {
    void ram();
}

interface Showable {
    void sita();
}

class A7 implements Printable, Showable {

    public void ram() {
        System.out.println("Hello");
    }
protected Object clone() throws CloneNotSupportedException{
        return super.clone();
}
    public void sita() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        A7 obj = new A7();
        obj.ram();obj.sita();
        A7 obj1 = (A7)obj ;
    }
}


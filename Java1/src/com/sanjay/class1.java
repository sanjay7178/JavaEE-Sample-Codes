package com.sanjay;
class DemoClass{
    void genericPrint(int t){
        System.out.println(t);
    }
    void genericPrint(String t){
        System.out.println(t);
    }
    void genericPrint(double t){
        System.out.println(t);
    }
}
public class class1 {
    public static void main(String[] args) {
        DemoClass aObj = new DemoClass();
        aObj.genericPrint(301);
        aObj.genericPrint("Sanjay");
        aObj.genericPrint(3.141452555);
    }
}

package com.sanjay.Problems;
class language{
    void displayinfo(String s){
        System.out.println("Hello");
    }
}
class java extends language{
    void displayinfo(String s,int i){
        System.out.println("hello hi");
    }
}
public class Problem1 {
    public static void main(String[] args) {
    java obj = new java();
    obj.displayinfo("Hello",3);
    }
}

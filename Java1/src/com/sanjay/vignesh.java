package com.sanjay;
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle{
    void run() {
        System.out.println("Bike is running safely");
    }
    static public class vignesh{
        public static void main(String[] args) {
            Vehicle obj=new Vehicle();
            Vehicle obj1=new Vehicle();
            obj.run();
            obj1.run();
        }
    }
}

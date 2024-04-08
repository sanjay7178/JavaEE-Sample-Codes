package com.sanjay;

public class Main {
    public static void main(String[] args) {
        Main funn = new Main();
        funn.fun2();
        //psvm is not having a instance variable
//        staticExample.Human sanjay = new staticExample.Human(22,"Sai Sanjay",15000,false);
//        staticExample.Human rahul = new staticExample.Human(22,"Sanjay",15000,false);
//        System.out.println(sanjay.population);
//        System.out.println(rahul.population);
        //you can use Human.population any times with out get a object created(by using static)
//        System.out.println(staticExample.Human.population);
//        System.out.println(staticExample.Human.population);
//        System.out.println(staticExample.Human.population);

//        greeting();
    }
    //this is not dependent on objects
    void fun2(){
        greeting();
    }
    static void fun(){
//        greeting();
//        you cannot  access non static stuff without
//        referencing their instances in a static context
        Main obj = new Main();
        obj.greeting();
    }
    //we know that something which is not static, belongs to a static
     void greeting(){
        System.out.println("Hello World!");
    }
}

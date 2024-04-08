//package com.sanjay.Problems;
//
//import java.util.Scanner;
//
//class employee{
//    String Empcode;
//    String name;
//    int age;
//    int experience;
//
//    public employee(String Empcode, String name, int age, int experience) {
//        this.Empcode = Empcode;
//        this.name = name;
//        this.age = age;
//        this.experience = experience;
//    }
//    void display(employee obj){
//        System.out.println(Empcode+" "+name+" "+age+" "+experience);
//    }
//
//    void check(employee obj) throws Exception{
//
//            if ((Empcode.length())!=6||name.length()>30 || age<18|| age>58 || experience<5){
//                throw new UserException("InputException");
//            }
//    }
//}
//class UserException extends Exception{
//    public UserException(String str){
//        super(str);
//    }
//}
//public class Problem7 {
//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        String Empcode = in.nextLine();
//        in.nextLine();
//        String name = in.nextLine();
//        in.nextLine();
//        int age = in.nextInt();
//        int experience = in.nextInt();
//        employee emp = new employee(Empcode,name,age,experience);
//        emp.display(emp);
////        emp.check(emp);
//    }
//}

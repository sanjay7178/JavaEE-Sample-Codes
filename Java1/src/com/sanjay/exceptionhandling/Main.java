package com.sanjay.exceptionhandling;
//3.	Write a Java program to implement the concept of Exception Handling using
//        predefined exception
public class Main {
    public static void main(String[] args) {
        int a =5;
        int b =0;

        try{
            divide(a ,b);
            throw new Exception("just for Fun");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("no matter this is always execute");
        }
    }
    static int divide(int a , int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("please donot divide by zero");
        }
        return a/b;
    }
}

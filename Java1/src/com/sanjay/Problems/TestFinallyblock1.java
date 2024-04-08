package com.sanjay.Problems;
/*Write a Java program to print the below statements.
        Division by zero: Print "Invalid division".
        String parsed to a numeric variable: Print "Format mismatch".
        Accessing an invalid index in string: Print "Index is invalid".
        Accessing an invalid index in array: Print "Array index is invalid".*/
public class TestFinallyblock1 {
    public static void main(String[] args) {
        try{
            try{
                int data = 25/0;
            }catch (ArithmeticException e){
                System.out.println("1st inner try block");
                System.out.println("Invalid division");
                System.out.println(e);
            }
            try{
                String s = "sanjay";
                int x  = Integer.parseInt(s);
            }catch (NumberFormatException e){
                System.out.println("2nd inner try block");
                System.out.println("Format mismatch");
                System.out.println(e);
            }
            try{
//                String myStr = "Hello planet earth, you are a great planet.";
//                System.out.println(myStr.indexOf("greatest"));
                StringBuilder str = new StringBuilder("sanjay");
                char ch1 = str.charAt(9);
                System.out.println(ch1);
            }catch (Exception e){
                System.out.println("3rd inner try block");
                System.out.println("Index is invalid");
                System.out.println(e);
            }
            try{
                int[] arr = new int[5];
                System.out.println(arr[6]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("4th inner try block");
                System.out.println("Array index is invalid");
                System.out.println(e);
            }
            System.out.println("outer try block");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

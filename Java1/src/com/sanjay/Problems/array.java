package com.sanjay.Problems;

public class array {
    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            arr[11/0]=7;
            System.out.println(arr[17]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);}
        catch (Exception e){
            System.out.println(e);
        }
    }}

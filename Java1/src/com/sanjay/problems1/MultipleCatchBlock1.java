package com.sanjay.problems1;

public class MultipleCatchBlock1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        } catch (Exception e){
            System.out.println("parent exception");
        }
        System.out.println("rest of code");
    }
}

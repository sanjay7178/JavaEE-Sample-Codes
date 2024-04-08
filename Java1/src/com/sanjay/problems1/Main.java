package com.sanjay.problems1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n  = in.nextInt();
        boolean ans = isPrime(n);
        if (ans) {
            System.out.println("It is a Prime Number");
        } else {
            System.out.println("It is not a Prime Number");
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while((c * c) <= n){
            if(n % c == 0){
                return false;
            }
            c += 1;
        }
        return true;
    }
}

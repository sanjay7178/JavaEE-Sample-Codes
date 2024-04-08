package com.sanjay.problems1;

//package com.sanjay.problems1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n  = in.nextInt();
        int A = 0;
        for (int i = 2; i < n+1; i++) {
            boolean ans = isPrime(i);
            if(ans){
                A= i;
            }
        }
        System.out.println("Largest: "+A);
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

package com.sanjay.problems1;

import java.util.Scanner;

//import static com.sanjay.problems1.Main.isPrime;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n  = in.nextInt();
       PrintPrime(n);
    }
    static void PrintPrime(int n){
        int c = 2;
        if (n<=1){
            System.out.println(-1);
        } else if (n==2) {
            System.out.println(2);
        } else if (n>2) {
            System.out.print(2+" ");
            for (int j = 3; j < n; j++) {
               if(isPrime(j)==true){
                   System.out.print(j+" ");
            }
            }
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

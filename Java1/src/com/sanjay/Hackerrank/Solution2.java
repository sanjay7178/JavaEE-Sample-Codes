package com.sanjay.Hackerrank;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s3 = null;
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            new StringBuilder(s1);
            s3.append(" x = %15\n");
            System.out.printf(String.valueOf(s3),x);
        }
        System.out.println("================================");

    }
}

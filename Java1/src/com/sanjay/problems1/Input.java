package com.sanjay.problems1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[]  arr  = new int[5];
        Scanner in  = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int num : arr) {//for every element in the array print the array
//            System.out.print(num + " ");//here num represents element of the array
//        }
//        System.out.println(Arrays.toString(arr));
        String[] str  = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}

package com.sanjay.Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class laptop{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number Laptop: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("laptop id"+ (i+1) + ": ");
            arr[i] = in.nextInt();
//            arr1[i] = in.nextInt();
        }
        int[] arr1 = arr;
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        if(arr1[9]==arr1[8]){
            System.out.println("Rithika is confused");
        } else {
            System.out.println("Rithika has purcahsed "+  Arrays.asList(arr).indexOf(arr1[9]));

        }
        System.out.println(Arrays.toString(arr));

    }
}
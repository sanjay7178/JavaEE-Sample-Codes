package com.sanjay.Problems;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int oddsum =0;
        int evensum =0;
        for (int num = 0; num < array.length; num++) {
            int x = array[num];
            if(x%2==0){
//                System.out.println("even "+x);
                evensum += x;
            }
            else{
//                System.out.println("odd "+x);
                oddsum+=x;
            }
        }
        System.out.println("oddsum "+oddsum);
        System.out.println("evensum "+evensum);
    }
}

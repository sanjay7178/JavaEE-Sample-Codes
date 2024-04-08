package com.sanjay.Problems;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> list  = new ArrayList<>();
        int start  = 0;
        int stop = k;
        for (int i = 0; i < s.length(); i++) {
            start += 1;
            list.add(s.substring(start,stop));
            stop +=k;
            if(stop==s.length()){
                break;
            }
        }
//        System.out.println(list);
        largest = list.get(s.length() - 1);
        smallest =list.get(0);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
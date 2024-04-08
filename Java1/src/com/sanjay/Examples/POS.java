package com.sanjay.Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class POS {
    public static void main(String[] args) {
        System.out.print("Enter the currency :");
        Scanner sc = new Scanner(System.in);
        int currency  = sc.nextInt();
        System.out.println("List of currency notes-->");
        int[] notes = {2000,1000,500,200,100,50,20,10,5,2,1};
        ArrayList<Integer> list =  new ArrayList<>();
        int b  =  0;
        for (int i = 0; i < notes.length; i++) {
            currency  =  currency - b ;

            list.add(Math.round(currency/notes[i]));
            b = (Math.round(currency/notes[i]))*notes[i];
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)!=0){

            System.out.println(notes[i]+" : "+list.get(i));
            }
        }
    }
}

package com.sanjay.problems1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>  list  = new ArrayList<>(5);
//        list.add(67);
//        list.add(554);
//        list.add(994);
//        list.add(747);
//        list.add(74);
//        System.out.println(list.contains(554));
//        list.set(0 , 99);
//        list.remove(2);
//        System.out.println(list);
//        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
//        get item of any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here list of index not work here
        }
    }

}

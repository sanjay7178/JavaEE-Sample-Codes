package com.sanjay.Examples;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String,String> JavaBuzzDict = new HashMap<String , String>();
        JavaBuzzDict.put("1","one");
        JavaBuzzDict.put("2","two");
        JavaBuzzDict.put("3","three");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Before :"+JavaBuzzDict);
        System.out.print("Enter the number of words to be added to the dictionary :");
        int n  = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter the word :");
            String key = sc.next();
            if(JavaBuzzDict.containsKey(key)){
//                System.out.println("Word already exists in the dictionary");
            System.out.print("Enter the meaning of the word :");
            String value = sc.next();
            JavaBuzzDict.put(key,JavaBuzzDict.get(key)+" "+value);
            }
            else{
                System.out.print("Enter the meaning of the value :");
                String value = sc.next();
                JavaBuzzDict.put(key,value);
            }

        }
            System.out.println("After :"+JavaBuzzDict);
    }
}

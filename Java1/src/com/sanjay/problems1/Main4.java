package com.sanjay.problems1;

//import static java.lang.StringUTF16.lastIndexOf;

//1.	Write a Java program to practice using String class and its methods
//Java String Class Methods
public class Main4 {
    public static void main(String[] args) {
        String s = " vit ap ";
        s.trim();
        System.out.println(s);
        boolean a= s.startsWith("v");
        System.out.println(a);
        boolean b=  s.endsWith("P");
        System.out.println(b);
        int c =s.charAt(2);
        System.out.println(c);
        int d  =s.length();
        System.out.println(d);
        String e  = s.replace(" ","&");
        System.out.println(e);
        int f = s.compareTo(e);
        System.out.println(f);
        char[] g = s.toCharArray();
        System.out.println(g);
        Object h = s;
        System.out.println(h);
    }
}

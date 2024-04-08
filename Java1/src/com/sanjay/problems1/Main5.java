package com.sanjay.problems1;

//2.	Write a Java program to practice using String Buffer class and its methods.
public class Main5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("VIT ap");
        sb.append(" University");
        System.out.println(sb);
        sb.insert(0,"#");
        System.out.println(sb);
        sb.replace(6,7,"is");
        System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.reverse();
        int i =sb1.capacity();
        System.out.println(sb1+" "+"updated capacity "+i);
        sb1.ensureCapacity(50);
        System.out.println(sb1+" "+"newly updated capacity "+i);
    }
}

//package com.sanjay.Problems;
//
//import java.io.File;
//import java.util.Scanner;
//
//public class Printwriter {
//    public static void main(String[] args) throws java.lang.Exception {
//        try {
//            File file = new File("C:\\Users\\LENOVO\\Desktop\\java\\Main.1.txt");
//            Scanner obj = new Scanner(file);
//            int words = 0;
//            while(obj.hasNextLine()){
//                String line = obj.nextLine();
//                words = words + (line.split("").length);
//
//            }
//            System.out.println(words);
//        }
//        catch(java.lang.Exception e){
//            System.out.println("file not found");
//        }
//    }
//}

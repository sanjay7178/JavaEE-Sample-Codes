//package com.sanjay.Problems;
//
//import java.io.File;
//import java.io.FilenameFilter;
//
//public class FileHandling
//{
//    public static void main(String[] args) {
//        try{
//            File f = new File("C:\\Users\\LENOVO\\Desktop\\java");
//            File[] matchingFiles = f.listFiles(new FilenameFilter() {
//                public boolean accept(File dir, String name) {
//                    return name.startsWith("temp") && name.endsWith("txt");
//                }
//            });
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println("rest of code");
//
//    }
//}
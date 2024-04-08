package com.sanjay.Examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileStroing {
    public static void main(String[] args) throws IOException {
        int[] arr1 ={10, 2, 0, 4, 5};
        String[] arr2  = {"a","b","c"} ;
        File file  = new File("data.txt");
        try {
            file.createNewFile();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        FileWriter fw  = new FileWriter(file.getName());
        fw.write(Arrays.toString(arr1));
        fw.write(Arrays.toString(arr2));
        fw.close();
        Scanner sc  = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}

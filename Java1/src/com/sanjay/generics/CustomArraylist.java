package com.sanjay.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {
    private int[] data;//we cant
    // directly modify array list but can modify it by
    //constructors and methods
private static int DEFAULT_SIZE =10;//also working as index value
private int size= 0;

    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
    }
    private boolean isFull() {
        return size == data.length;
    }
    public  int remove(){
        int removed = data[--size];
        return removed;
    }
public int get(int index){
        return data[index];
}
public int set(){
        return size;
}
public void set(int index , int value ){
        data[index] = value;
}

    @Override
    public String toString() {//tostring belongs to
        //print statement thus it requires to ovveride because
        //to print our own customArrayList
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArraylist list = new CustomArraylist();
//        list.add(3);
//
//        list.add(5);
//        list.add(6);
        for ( int i =0; i <14 ; i++){
            list.add(2 * i);
        }
        System.out.println(list);
    }
}

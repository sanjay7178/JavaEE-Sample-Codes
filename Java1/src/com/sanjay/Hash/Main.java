package com.sanjay.Hash;
import java.util.HashSet;

class Main extends Object {

    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(1);
        evenNumber.add(2);
        evenNumber.add(3);
        evenNumber.add(4);
        System.out.println("HashSet1: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();

//        // Using addAll() method
//        numbers.addAll(evenNumber);
        numbers.add(2);
        numbers.add(3);
        boolean bool =evenNumber.containsAll(numbers);
        System.out.println(bool);
//        System.out.println("New HashSet: " + numbers);
//        Object s = new Object();
//        System.out.println(s);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

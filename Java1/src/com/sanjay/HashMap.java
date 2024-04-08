package com.sanjay;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Object,Object> numbers  = new java.util.HashMap<>();
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",2);
//        numbers.remove()
        System.out.println("Map:" +numbers);
        System.out.println("keys"+numbers.keySet());
        System.out.println("values"+numbers.values());
        System.out.println("Entries"+numbers.entrySet());
        Object value = numbers.remove("Two");
        System.out.println("removed val"+value);
    }
}

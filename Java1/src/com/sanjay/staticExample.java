package com.sanjay;

public class staticExample {
    public static class Human{
        int age;
        String name;
        int salary;
        boolean married;
        static long population;
        static void message(){
            System.out.println("Helllo World");
//            System.out.println(this.age);//cannnot use over here

        }
        public Human(int age, String name, int salary, boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Human.population += 1;
        }
    }
}

package com.sanjay;
//class Test{
//    static String name;
//    public Test(String name) {
//        Test.name = name;
//    }
//}
public class Innerclasses {
    static class Test {//Test is depending upon the Innerclass but
        //not to its objects
        static String name;

        public Test(String name) {
            Test.name = name;
        }

        public static void main(String[] args) {
            Test a = new Test("Sanjay");
            Test b = new Test("Rahul");
            System.out.println(a.name);
            System.out.println(b.name);
        }
    }
}

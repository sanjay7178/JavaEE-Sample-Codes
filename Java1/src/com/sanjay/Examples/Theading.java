package com.sanjay.Examples;

public class Theading {

    static class Counting{
        int count=4;
        synchronized void decrement(){
            try{
                Thread.sleep(3000);
                count-=1;
                if(count>0){
                    System.out.println("1 seat is reserved for you");
                } else{
                    System.out.println("Available seats=0");
                    System.out.println("Sorry, theatre is Housefull");

                }
            } catch (Exception e){

            }



        }

    }

    static Counting count;
    static class Booktickets extends Thread{
        public void run(){
            count.decrement();
        }
    }

    public static void main(String[] args) {
        count = new Counting();
        Booktickets[] studnets = new Booktickets[5];
        for (int i = 0; i < studnets.length; i++) {
            studnets[i] = new Booktickets();
        }
        for (int i = 0; i < studnets.length; i++) {
            studnets[i].start();
        }

        System.out.println("Available tickets = 3");
    }
}

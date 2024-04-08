package com.sanjay.Runnable;
class TA implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A "+i);
        }
    }
}
class TB implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B "+i);
        }
    }
}
public class MyT{


    public static void main(String[] args) {
        Thread Ta = new Thread(new TA());
        Ta.start();
        Thread Tb = new Thread(new TB());
        Tb.start();
    }
}

package com.sanjay.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelarate");
    }
}

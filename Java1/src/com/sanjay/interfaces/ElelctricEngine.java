package com.sanjay.interfaces;

public class ElelctricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine Accelarate");
    }
}

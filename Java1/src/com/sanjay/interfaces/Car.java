package com.sanjay.interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("I brake a normal car");
    }

    @Override
    public void start() {
        System.out.println("I can Start engine a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I can Stopengine  a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I can Accelarate a normal car");
    }
}

package com.syntax.JavaBasics.class24.InterfaceDemo2;

public interface Driveable {
    void drive();

}

class Bike implements Driveable {
    @Override
    public void drive() {
        System.out.println("Driving a bike");
    }
}

class Car implements Driveable {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
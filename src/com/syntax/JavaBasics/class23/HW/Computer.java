package com.syntax.JavaBasics.class23.HW;

public class Computer {
    //TASK 1: Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class
    // and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array.
    // Loop through each object and execute available methods.

String name;
int year;
static double price;
int memory;

void System() {
    System.out.println("This computer has an operating system");}
    void Memory() {
        System.out.println(name+" has a "+memory+" memory");
    }
    void BatteryLife() {
        System.out.println("This computer battery lasts longer");
    }
}
class Apple extends Computer{
    @Override
    void BatteryLife() {
        super.BatteryLife();
        System.out.println("This battery life is for very short amount of time");
    }
}




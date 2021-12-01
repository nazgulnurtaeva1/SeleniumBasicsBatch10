package com.syntax.JavaBasics.class23.AbstractionDemo;

public abstract class Vehicle {
// abstract String vin_number; -->abstract not allowed with fields
    String vinNumber;
    static int totalVehicles;
    String make;
    String model;
    String carType;

    /*
    abstract Vehicle(){
    abstract not allowed with constractors
     */
    Vehicle(String vinNumber) {
        totalVehicles++;
        this.vinNumber= this.vinNumber;
        System.out.println("Grandpas constructor is called");
    }
    public void printVehicleCount() {
        System.out.println(totalVehicles+" Vehicle creating");
    }
    public void drive() {
        System.out.println(" Vehicle is driving ");
    }
    public void stop() {
        System.out.println("Vehicle stopping");
    }
    public abstract void start(); //no need body for abstractors

    void displayInfo() {
        System.out.println("We build " + make + " model " + model + " " + carType + " " + vinNumber);

    }
}
abstract class Car extends Vehicle{
    String carType;
    Car(String carType, String vinNumber) {
        super(vinNumber);
        this.carType=carType;
        System.out.println("Parent constructor is called");
    }
    public void drive() {
        System.out.println(" Car is driving ");
    }
    public abstract void speed();

}
class BMW extends Car{
    String make;
    String model;
    BMW(String vinNumber, String carType, String make, String model){
        super(carType, vinNumber);
        this.make=make;
        this.model=model;
        System.out.println("BMW Constructor");

    }
    @Override
    public void speed() {
        System.out.println("BMW can run 300km/h");
    }
    @Override
    public void start() {
        System.out.println("BMW can start using remote");

}}

class Toyota extends Car{
    String make;
    String model;
    Toyota(String vinNumber, String carType, String make, String model){
        super(carType, vinNumber);
        this.make=make;
        this.model=model;

    }
    @Override
    public void speed() {
        System.out.println("Toyota can run 200km/h");
    }
    @Override
    public void start() {
        System.out.println("Toyota can start using keys");
    }
    void displayInfo(){
        System.out.println("we build "+make+" model "+model+" "+carType+" "+vinNumber);
    }

}

class VehicleTester{
    public static void main(String[] args) {
        BMW bmw=new BMW("132x1", "Sedan", "BMW", "XS");
        bmw.printVehicleCount();
        bmw.speed();
        bmw.start();
        bmw.drive();
        bmw.stop();

        Vehicle Toyota=new Toyota("452ty", "Sedan", "Toyota", "Venza"){

        };
    }
}



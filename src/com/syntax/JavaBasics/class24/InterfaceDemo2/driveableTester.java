package com.syntax.JavaBasics.class24.InterfaceDemo2;

public class driveableTester {

    public static void main(String[] args) {
//        Driveable driveable =new Bike();
//        driveable.drive();
//
//        Driveable driveable1=new Car();
//        driveable1.drive();

        Driveable [] driveables={new Bike(), new Car()};
        for(Driveable dr: driveables) {
            dr.drive();
        }
    }
}

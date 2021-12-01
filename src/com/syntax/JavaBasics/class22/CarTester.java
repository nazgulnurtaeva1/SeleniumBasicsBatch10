package com.syntax.JavaBasics.class22;

public class CarTester {
    public static void main(String[] args) {
//        BMW bmw=new BMW();
//        bmw.start();
//        bmw.stop();
//        bmw.park();

        /*
        Tesla tesla=new Tesla();
         tesla.start();
         tesla.stop();
         tesla.park();


         */

        Car[] cars={new BMW(), new Tesla(), new Toyota()};
        for (Car car:cars
        ) {
            car.start();
            car.stop();
            car.park();
        }


    }
}

package com.syntax.JavaBasics.JavaReview.Review20;

public class Cardiologist extends Doctor{


    public Cardiologist(String name, String lastName, String speciality) {
        super(name, lastName, speciality);
    }

    public static void main(String[] args) {
        Cardiologist smith=new Cardiologist("John", "Smith", "cardiologist");
        smith.printInfo();
        smith.treatPatient("Olll");
        smith.work();
        Doctor.companyName(); //==>it's a static method, we can access it by class name
        //smith.getPaid(); --> PRIVATE DON'T PARTICIPATE
smith.Think(); //++> comes from Human (grantparent) class
//smith.haveCertificate(); Can not access to the child class, there is no access between them
        //ALL ACCESS MODIFIERS ARE AVAILABLE WITHIN SAME PACKAGE AND DIFFERENT CLASS
//EXCEPT PRIVATE.  PRIVATE is only available its own class

    }
}

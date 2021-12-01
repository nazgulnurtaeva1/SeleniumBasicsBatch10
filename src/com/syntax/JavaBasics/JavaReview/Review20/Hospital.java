package com.syntax.JavaBasics.JavaReview.Review20;

public class Hospital {
    public static void main(String[] args) {
        Doctor doctor1=new Doctor("John", "Smith", "dentist", 200000);
        Doctor.hospital="Inova";
        doctor1.printInfo();
        doctor1.work();

        //this block of code for Instance variable, we don't need it for Constractors
//        doctor1.name="John";
//        doctor1.lastName="Doe";
//        doctor1.speciality="Dentist";
//doctor1.lastName="Noel";
//        Doctor.hospital="Inova";
//        doctor1.work();

        Doctor doctor2=new Doctor("Jane", "Smith", "Therapist");
//        doctor2.name="Jane";
//        doctor2.lastName="Smith";
//        doctor2.speciality="Cardiologist";
        doctor2.work();
        //if we change 1 static, it will affect everywhere(it will change all statics)
        Doctor.hospital="JW Hospital"; //all hospitals will be changed for JW Hospital
//doctor2.lastName="Bond";

        System.out.println();

        doctor1.work();
        System.out.println(doctor1.lastName);
        System.out.println(doctor2.lastName);

        //accessing static method
        Doctor.companyName();
doctor1.treatPatient("James");
doctor2.treatPatient("Anna");
//Doctor Jane treats patient Anna
    }
}

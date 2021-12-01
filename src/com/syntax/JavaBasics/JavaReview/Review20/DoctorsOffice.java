package com.syntax.JavaBasics.JavaReview.Review20;

public class DoctorsOffice {
    public static void main(String[] args) {
        Doctor doctor1=new Doctor("John", "Doe", "gynecology");
        System.out.println(doctor1.name);
        System.out.println(doctor1.lastName);
        System.out.println(doctor1.speciality);
        System.out.println(doctor1.salary);
        //System.out.println(doctor.ssn); //it's not visible, because its private

        doctor1.treatPatient("Hasim");
        doctor1.printInfo();
        doctor1.work();
//doctor1.getPaid();  its not available, because its private


    }
}

package com.syntax.JavaBasics.JavaReview.Review20;

public class Doctor extends Human {
    //instance variable
   public String name="Mina";
   public String lastName;
   protected String speciality;
    double salary;
    private long ssn; //visible only within the same class
//static var
   public static String hospital="Sparrow";

    //Constractors
    public Doctor(String name, String lastName, String speciality) {
        this.name= name;
        this.lastName=lastName;
        this.speciality=speciality;
        System.out.println(name+" "+lastName+" "+speciality);
    }
    //Constractors
    Doctor(String name, String lastName, String speciality, double salary) {
       this.name= name;
        this.lastName=lastName;
        this.speciality=speciality;
        this.salary=salary;
        System.out.println(name+" "+lastName+" "+speciality+" "+salary);
    }

//Methods
   public void treatPatient(String name) {
        //if I want to say that 'Doctor John treats patient James',
        // I have to differenciate it by calling Instance var with 'this'
        System.out.println("Doctor "+this.name+" treats patient "+name);

    }
  void printInfo() {
        System.out.println(this.name+" "+lastName+" is a "+speciality);
    }
//instance methods can work with instance and static variables
   protected void work() {
        System.out.println(name+" works at hospital "+hospital);
    }
    private void getPaid() {
        System.out.println(name+" gets paid "+salary);
    }

//STATIC methods can work only with static variable, EX: there is 'hospital' static
    static void companyName() {
        System.out.println("All doctors work at "+hospital);
    }

}

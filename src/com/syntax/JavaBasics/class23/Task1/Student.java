package com.syntax.JavaBasics.class23.Task1;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses
    as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override
some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */

    void Study() {

    }
    class SyntaxStudent extends Student{
        void study() {
            System.out.println("Students must study");
        }
        void doHomeWork() {
            System.out.println("Students must do homework");
        }
        void practice() {
            System.out.println("Students must practice");
        }
    }
    class SyntaxStudents extends Student{

        void study() {
            System.out.println("Students must study 25 h per week");
        }
        void doHomework(){
            System.out.println("Students must solve repls");
        }
        void doResearch() {

        }

    }

}

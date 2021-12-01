package com.syntax.JavaBasics.class19.Inheritance.Task3;

public class MathTeacher extends Teacher {
    String major ="Math";

    void behaviourMathTeacher(){
        System.out.println("Math teacher is teaching "+major+" for the kids. " +
                "His is working "+workTime+" hours per week");

    }
}

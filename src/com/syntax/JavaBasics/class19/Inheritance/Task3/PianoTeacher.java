package com.syntax.JavaBasics.class19.Inheritance.Task3;

public class PianoTeacher extends Teacher {

    String major="piano";

    void behaviourPianoTeacher() {
        System.out.println(major+" teacher is teaching to play the piano. His " +
                "retirement age is "+retirementAge);
    }
}

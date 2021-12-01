package com.syntax.JavaBasics.class19;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    String education;

    Person(String nameP, int ageP) {
        name="Aibek";
        age=29;
    }
Person(String nameP, int ageP, double weightP, double heightP) {
        this(nameP, ageP);
        weight=weightP;
        height=heightP;
        education="high";

}
void PrintAll(){
    System.out.println("Student name is "+name+"! He is "+age+"! His education is "+education);
}

    }








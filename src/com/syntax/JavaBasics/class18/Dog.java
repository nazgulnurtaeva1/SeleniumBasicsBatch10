package com.syntax.JavaBasics.class18;

public class Dog {

    String name;
    int age;
    double weight;
    double height;
    String breed;
    String color;
    static int noOfLegs=4;

    Dog() {
        name="Aktos";
        age=5;
        weight=23.5;
        height=3.4;
        breed="Husky";
        color="white";
    }
    Dog(String dogName, int DogAge) {
        name="None";
        age=7;
        weight=20.5;
        height=3.9;
        breed="Huskyyyy";
        color="blue";
    }
    Dog(String Nname, int Aage, double Hheight) {
        name="Tuzik";
        age=9;
        weight=23.9;
        height=3.4;
        breed="Husssssky";
        color="grey";
    }
    void printDogInfo() {
        System.out.println(name +" is the breed of "+breed+". The age of the dog is "+age +
                "The weight is "+weight+" and height is "+height+"." +
                " And the color is "+color);
    }

}

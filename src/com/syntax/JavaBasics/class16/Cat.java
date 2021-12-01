package com.syntax.JavaBasics.class16;

public class Cat {

    String name;
   static String breed;
    int age;
    double weight;

    void CatInfo() {
        System.out.println(name+" is my cat's name. " +
                "She is "+age+" years old. Her breed is "+breed+"! Her weight is "+weight);
    }
    void catSleepInfo() {
        System.out.println(name+" "+breed+" usually sleeps 8 hours per day");
    }
}

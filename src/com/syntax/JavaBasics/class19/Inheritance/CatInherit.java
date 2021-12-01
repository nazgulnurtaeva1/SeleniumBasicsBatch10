package com.syntax.JavaBasics.class19.Inheritance;

public class CatInherit extends AnimalInherit {
String name="Meow";
String breed="Persian";

    void PrintCatInfo() {
        System.out.println("My cat's name is "+name+". His " +
                "weight and height are "+weight+" "+height);
    }
    void CatSleep() {
        System.out.println("My cat usually sleeps 16 hours per day. " +
                "His age is "+age);
    }
}

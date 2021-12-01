package com.syntax.JavaBasics.class19.Inheritance;

public class DogInherit extends AnimalInherit{

    String name="Tuzik";
String breed="Husky";
   public void PrintDogInfo() {
        System.out.println("My dog's breed is "+breed+"! He is so old. " +
                "His age is "+age+" "+name);
    }
}

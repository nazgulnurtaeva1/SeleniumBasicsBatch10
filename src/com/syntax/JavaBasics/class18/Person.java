package com.syntax.JavaBasics.class18;

import java.sql.SQLOutput;

public class Person {

    String name;
    int age;
    String country;
    double weight;
    double height;

    //It's a Constructor, because it doesn't have return type(not even VOID)
    // & it has same name as Class name
     Person (String personName, int personAge) {
         name=personName;
         age=personAge;
         country="USA";
         weight=128;
         height=5.7;
     }
     void printInfo() {
         System.out.println(name+" is from "+country+"! She is "+age+" old. " +
                 "Her height and weight parametes are "+ height+", "+weight);
     }

}

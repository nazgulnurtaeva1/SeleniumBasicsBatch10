package com.syntax.JavaBasics.class17;

public class Task2HW {

    //TASK: Create a method that will take a String
    // as a parameter and returns reversed String.
    // Method should be available to all classes within
    // your project and accessible by class name.

    public static String reversed(String name) {

      return  new StringBuilder(name).reverse().toString();
    }



}



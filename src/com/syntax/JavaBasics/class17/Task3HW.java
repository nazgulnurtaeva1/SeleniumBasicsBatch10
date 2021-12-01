package com.syntax.JavaBasics.class17;

import java.sql.SQLOutput;

public class Task3HW {

    /* Create a method that will accept a String as a
    parameter and return a new String that consist only of
    vowels. Method should be available inside the class only
    where it was declared and executed by calling it is name.
     */

    private static String onlyVowels(String inputStr) {
        return inputStr.replaceAll("[^A,E,I,O,U,a,e,i,o,u]", "");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("Syntax Tech School"));
    }

}

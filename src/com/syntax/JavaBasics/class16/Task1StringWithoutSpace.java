package com.syntax.JavaBasics.class16;

public class Task1StringWithoutSpace {
    public static void main(String[] args) {
        //Task01:    Write a String sentence and write a new String without any spaces

        String name = "This sentence with spaces";
        System.out.println(name.replaceAll(" ", ""));
        System.out.println(name.replaceAll("\\s", ""));

    }
}

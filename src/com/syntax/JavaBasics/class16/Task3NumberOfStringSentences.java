package com.syntax.JavaBasics.class16;

public class Task3NumberOfStringSentences {
    public static void main(String[] args) {

        //Task: String a="Is it Saturday today? Is it raining outside? Are you studying today?";
        //How many sentences this string has?

        String a="Is it Saturday today? Is it raining outside? Are you studying today?";
        System.out.println(a.split("[?]").length);

    }
}

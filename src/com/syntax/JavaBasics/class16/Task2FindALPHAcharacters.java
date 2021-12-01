package com.syntax.JavaBasics.class16;

public class Task2FindALPHAcharacters {

    public static void main(String[] args) {
        //TASK: Write a String that should be combination of the
        //numbers, letters, special characters. Find out how many ALPHA characters in the sentence

        //CND+ALT+L to format the codes in Intelij


        String name = "My name is Nazgul!****7890))(0";   //ALPHA characters means (alphanumeric)==> NUMBERS, ALPHABETS
        System.out.println(name.replaceAll("[^a-zA-Z0-9]", "").length());


    }
}

package com.syntax.JavaBasics.class16;

public class Task6Swap2Strings {

    public static void main(String[] args) {

        //Task: How would you Swap two Strings without temporary Variable

        String str1 = "String one";
        String str2 = "String two";

        str1=str1+str2;
        str2 = (str1.substring(0, str2.length()-str1.length()));
        str1=str1.substring(str1.length()-str2.length());

        System.out.println(str2);
        System.out.println(str1);







    }
}

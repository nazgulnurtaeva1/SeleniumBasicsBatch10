package com.syntax.JavaBasics.class16;

public class Task5StringPalindrome {

    public static void main(String[] args) {

        //Task: Is this word polindrome or not?

        String s="ata";
        String reversed =new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(reversed)) {
            System.out.println("Polindrome");
        } else {
            System.out.println("not polindrome");


        }
    }
}

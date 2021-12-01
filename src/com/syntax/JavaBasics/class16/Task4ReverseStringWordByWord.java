package com.syntax.JavaBasics.class16;

public class Task4ReverseStringWordByWord {

    public static void main(String[] args) {

        //Task:   How would you Reverse String sentence  word by word

        String str="This is a sentence that I want to reverse";
        String [] arr=str.split(" ");

        for(int i=0; i< arr.length; i++) {

            StringBuilder strB = new StringBuilder(arr[i]);
            strB.reverse();
            arr[i] = strB.toString();
            System.out.println(arr[i]);

        }

    }
}













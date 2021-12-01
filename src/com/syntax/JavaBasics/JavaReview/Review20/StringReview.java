package com.syntax.JavaBasics.JavaReview.Review20;

public class StringReview {
    public static void main(String[] args) {
        String str="Today is Thursday and it is Java Review";
        boolean empty=str.isEmpty();
        System.out.println("My String is empty = "+empty);

        int length=str.length();
        System.out.println("Length of the String is "+length);

        //Instead Thursday I want to have Monday

        str.replace("Thursday", "Monday");
        System.out.println(str); //Today is Thursday"==> will be printed, because its not reassigned
       str= str.replaceAll("Thursday", "Monday");//---> we have reassigned
        System.out.println(str);

        //how many words my String has?
       String[] allWords = str.split(" ");
        System.out.println("In my String I have "+allWords.length+" words");

//print all words one by one
        for(String word :allWords) {
            System.out.print(word+", ");
        }

        //how would u reverse a String?

        String give="Hello";
        StringBuilder stringBuilder=new StringBuilder(give);
        stringBuilder.reverse();
        System.out.println(give);

        //how would u reverse a String without using a reverse
         give="Hello World";
         String reverse="";
        for(int i=give.length()-1; i>=0; i--) {
            reverse+=give.charAt(i);  //attaching to reverse
        }
        System.out.println(reverse);

//Reverse String without using StringBuilder Task2
           String city="Detroit";
        String reversed="";

        for(int i=city.length()-1; i>=0; i--) {
            reversed=reversed+city.charAt(i);

        }
        System.out.println(reversed);

        //SUBSTRING-it's a part from my string
        String s="Today I am happy";
        s=s.substring(6, 16); //I am happy
        s=s.substring(5); //happy
        System.out.println(s);
        s="Today I am happy";
        s=s.substring(6, 10);  //I am
        System.out.println(s);

        //charAt --> picking up the letter
                //01234567890123456789012  0-23
        String n="I love Java programming";
        System.out.println(n.charAt(7));  //J
        System.out.println(n.charAt(0));   //I

        System.out.println(n.length());  //23
        System.out.println(n.indexOf("J"));  //7
        System.out.println(n.indexOf("mming"));  //18

        System.out.println(n.isEmpty());  //false

        System.out.println(n.toLowerCase());  //all lower case
        System.out.println(n.toUpperCase());  //all upper case


    }






}

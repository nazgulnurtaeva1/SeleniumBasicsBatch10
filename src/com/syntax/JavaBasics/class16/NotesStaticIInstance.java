package com.syntax.JavaBasics.class16;

import java.sql.SQLOutput;

public class NotesStaticIInstance {

        static int noOfLegs = 4;
       String catName;

       static void display () {

               System.out.println(noOfLegs);
               //System.out.println(catName); //Static Method can not Access to the Instance Variable
       }

       void displayMethod() {
               System.out.println(noOfLegs);
               System.out.println(catName); //Regular Method can have Access for both Static and Regular Variable Values
       }



}

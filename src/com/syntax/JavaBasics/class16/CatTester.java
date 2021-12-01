package com.syntax.JavaBasics.class16;

public class CatTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="Lola";
        c.age=4;
        c.weight=3.2;
      Cat.breed="Persian";

      Cat c2=new Cat();
      c2.name="Ninny";
      c2.catSleepInfo();
       //This statement will be executed --> Ninny Persian usually sleeps 8 hours per day

        c.CatInfo();
        //statement below will be executed
//Lola is my cat's name. She is 4 years old.
// Her breed is Persian! Her weight is 3.2.


    }
}

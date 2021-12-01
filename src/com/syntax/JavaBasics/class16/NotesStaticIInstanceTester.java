package com.syntax.JavaBasics.class16;

public class NotesStaticIInstanceTester {
    public static void main(String[] args) {

        NotesStaticIInstance cat1 = new NotesStaticIInstance();
        cat1.catName="Mano";

        NotesStaticIInstance cat2 = new NotesStaticIInstance();
        cat2.catName = "Mary";

        NotesStaticIInstance.display();


    }
}

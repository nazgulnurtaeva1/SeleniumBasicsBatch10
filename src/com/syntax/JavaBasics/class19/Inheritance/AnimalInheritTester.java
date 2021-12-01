package com.syntax.JavaBasics.class19.Inheritance;

public class AnimalInheritTester extends AnimalInherit {
    public static void main(String[] args) {
        DogInherit dog=new DogInherit();
        dog.PrintDogInfo();

        CatInherit cat=new CatInherit();
        cat.CatSleep();
        cat.PrintCatInfo();

        AnimalInherit animal=new AnimalInherit();
        animal.Print();

    }
}

package com.syntax.JavaBasics.class18;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog("Shurik", 1);
        dog1.printDogInfo();

        Dog dog2=new Dog();
        dog2.printDogInfo();

        Dog dog3=new Dog("namm", 2, 3.4);
        dog3.printDogInfo();
    }
}

package com.syntax.JavaBasics.class19;

public class Pet {
    String name;
    String breed;
    String color;
    int age;

    Pet() {

    }
    Pet(String name, String breed, String color, int age) {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }
}

class Dog extends Pet {
    Dog (String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }
    void print(){
        System.out.println(name);
    }
}
class Cat extends Pet {
    Cat(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }
    void print() {
        System.out.println(name);
    }
}

 class PetTester {
    public static void main(String[] args) {
        Dog dog=new Dog("Boby", "Husky", "grey", 5);
        dog.print();
    }
}
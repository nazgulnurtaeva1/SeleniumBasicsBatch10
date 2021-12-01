package com.syntax.JavaBasics.class17.ReviewAccessModifiersConstructors;

public class DogReview {
    String name;
    int age;
    double height;
    double weight;

    public DogReview() {
        System.out.println("This code will be executed automatically when you create an object" +
                "of this class"+" There should be dog info: "+name+" "+age);
        System.out.println("This constructor without parameter");
    }
    public DogReview(String name) {
        this(); // ==> this code means System.out.println("This code will be executed automatically when you create an object" +
                      // "of this class"); copied from first line, I don't have to rewrite that
        this.name = name;
        System.out.println("This constructor with 1 parameter");
    }

    public DogReview(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("This constructor with 2 parameters   "+" There should be dog info: "+name+" "+age);

    }
    public DogReview(String name, int age, double height) {
            // this.name = name;
            // this.age = age;
        this(name, age);
             this.height = height;
        System.out.println("This constructor with 3 parameters");
         }
    public DogReview(String name, int age, double height, double weight) {
       /*
       this.name = name;
        this.age = age;
        this.height = height;
      */
      this(name, age, height); //without repeating codes(instead of 3 lines codes, we can write only 1 line)
      this.weight = weight;
        System.out.println("This constructor with 4 parameters");

    }

    public static void main(String[] args) {
        DogReview dog=new DogReview("Aktos", 5, 34.3, 23);
        System.out.println(dog);
    }
}

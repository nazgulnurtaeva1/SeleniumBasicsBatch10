package com.syntax.JavaBasics.JavaReview.Review20.ExampleSuperConstr;

public class Parent {

    public Parent(String str) {
        System.out.println("I am a parent class Constructor "+str);
    }



}

class Child extends Parent{

    /*    It will happen automatically
    if we don't create a Constructor
    Child() {
    super();
 }
     */

    public Child(String str) {
        super(str);
        System.out.println("I am a child class Constructor");
    }


}
package com.syntax.JavaBasics.class21.MethodOverloadingEx;

public class Parent {
    String name="Sedat";
    void printName() {
        System.out.println("name is "+name);

    }
    void getMarried(){
        System.out.println("Ahmet will get married by my choice");
    }
}

class Child extends Parent{

    String name="Ahmet";
    @Override
   void getMarried() {
        System.out.println("Ahmet wants to marry for someone else");
    }

    void letsDoSomethingCrazy() {
        super.getMarried();  //it's calling from parent class
        this.getMarried(); //calling from another method in the same class
getMarried();
    }

    public static void main(String[] args) {
        Child child=new Child();

        child.letsDoSomethingCrazy();


    }


}


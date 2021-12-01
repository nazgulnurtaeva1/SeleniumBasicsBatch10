package com.syntax.JavaBasics.class22;

public class Parent {

    void method(int num) {
        System.out.println("From Parent");
    }
}

class Child extends Parent {
    @Override
    void method (int num) {   //if we change the data type, we can't override
        System.out.println("From Child");  //overriding from parent class
    }

//    @Override
//    void method(int num) {
//        System.out.println(num); //can't decrease the visibility
//

//        @Override
//       public void method(int num) {
//            System.out.println(num); //can't decrease the visibility


   // void method (String num) {
    //    System.out.println("From Child");  //Overloading Methods, same name, diff parameters

}
 class Tester{
     public static void main(String[] args) {
         Child child=new Child();
         child.method(10);
     }

     }

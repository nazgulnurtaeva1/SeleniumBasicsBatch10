package com.syntax.JavaBasics.class21.MethodOverloadingEx;

public class MethodOverloadingExamples {

//   void method(int number) {
//        System.out.println(number);
//    }
//
//
//     public void method(int number) {
//        System.out.println(number);
//    }
//    //can't overload by changing access modifier
//
//    static void method(int number) {
//        System.out.println(number);
//    }
//    //can't overload by changing non access modifier
//
////    void method1 (int number) {
////        System.out.println(number);
////    }
////    //can't overload by changing method name
//
//
//
//    int method(int number) {
//        System.out.println(number);
//    }

    void method1 (int number) {
        System.out.println(number);
    }


    void method1 (int number, String name) {
        System.out.println(number+name);
    }
    //can overload by changing number of parameters

    void method1 (String name, int number) {
        System.out.println(name+number);
    }
     //can overload by changing sequence

     void method1 ( char c, double number) {
         System.out.println(c + number);
     }
    //can overload by changing method type


}

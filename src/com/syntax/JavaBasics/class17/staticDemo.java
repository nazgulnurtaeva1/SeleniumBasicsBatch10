package com.syntax.JavaBasics.class17;

public class staticDemo {
    
    String name;
    static String school;
    int age;
    
    void method1 () {
        System.out.println(name);
        System.out.println(school);
    }
    static void method2 () {
        //System.out.println(name); ===> Error, instance variable can't executed inside static method
        System.out.println(school);
        
        staticDemo staticdemo = new staticDemo();
        String name = staticdemo.name;
        method3();
        method2();

    }
    static void method3 () {
        System.out.println("This is method 3");
    }

    public static void main(String[] args) {
        AccessModifierDemo1 accessModifierDemo1 = new AccessModifierDemo1();
        accessModifierDemo1.method3();
        accessModifierDemo1.method2();


    }



}

package com.syntax.JavaBasics.class17.ReviewAccessModifiersConstructors;

public class MultiClassConstructorDemo {

    public MultiClassConstructorDemo() {
        System.out.println("Constructor 1");
    }
    public MultiClassConstructorDemo(String name, int age) {
        System.out.println("Constructor 2");
    }

    public MultiClassConstructorDemo(int age, String name) {
        System.out.println("constructor 3");
    }
}

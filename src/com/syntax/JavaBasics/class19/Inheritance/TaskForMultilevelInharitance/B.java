package com.syntax.JavaBasics.class19.Inheritance.TaskForMultilevelInharitance;

public class B extends C {

String classname="B";

void PrintClassB() {
    System.out.println("This is the printed class "+classname);
}

    public static void main(String[] args) {
        C classC=new C();
        classC.printClassC();
    }

}

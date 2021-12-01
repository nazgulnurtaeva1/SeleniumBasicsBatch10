package com.syntax.JavaBasics.class23.Example2;

public class Person {
    String name;
    Person(String name) {
        this.name=name;
    }
    void eat() {
        System.out.println(name+" Person eating");
    }
    void performDailyTask() {
        System.out.println("Eat sleep repeat");
    }
}

class Employee extends Person {
    Employee(String name) {
        super(name);
    }
    void performDailyTask() {
        System.out.println("Working all day in office and reading email at night");
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
    void performDailyTask() {
        System.out.println("Attending the classes during the day ");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name);
        }
        void performDailyTask() {
        System.out.println("Teaching during the day at school ");
        }
        void designClasses() {
            System.out.println("Create repls and design new classes");
        }
}

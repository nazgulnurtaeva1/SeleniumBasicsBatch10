package com.syntax.JavaBasics.class24;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new SDETInstructor();
        person.eat();
        person.sleep();
      //  person.work(); ---> because it's not in person interface
       // person.teach();

        Employee employee=new SDETInstructor();
        employee.work();
        //employee.eat(); //it's in person interface
        //employee.sleep();

        SyntaxEmployees syntaxEmployees=new SDETInstructor();
        syntaxEmployees.teach();
        syntaxEmployees.work();
        syntaxEmployees.sleep();
        syntaxEmployees.eat(); //it's all accessible because all extended
    }
}

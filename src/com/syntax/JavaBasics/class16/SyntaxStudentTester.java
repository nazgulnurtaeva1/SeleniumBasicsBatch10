package com.syntax.JavaBasics.class16;

public class SyntaxStudentTester {

    public static void main(String[] args) {

        SyntaxStudent student1 = new SyntaxStudent();
        student1.age=22;
        student1.name="Nazgul";
        student1.id="123";

        SyntaxStudent.schoolName = "Syntax techs";

        System.out.println(SyntaxStudent.schoolName);

        SyntaxStudent student2 = new SyntaxStudent();
        student2.age = 25;

        student2.id = "12345555";

        System.out.println(SyntaxStudent.schoolName+student1.name);



    }
}

package com.syntax.JavaBasics.class17;

public class StudentTester {
    public static void main(String[] args) {

        Student student =new Student();
        student.studentId = "55";
        student.studentName="Naz";
        Student.numberOfStudents++;

        Student student2 = new Student();
        student.studentId = "32";
        student.studentName = "Zholdas";
        Student.numberOfStudents++;

        Student student3 = new Student();
        student.studentId = "85";
        student.studentName = "Farabi";
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);


    }
}

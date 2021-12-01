package com.syntax.JavaBasics.class19.Inheritance.Task3;

public class Teacher {
    String IQ="high intelligent";
    String behaviour="polite";
    String major="teaching";
    int workTime=36;
    int retirementAge=65;

    void behaviourTeacher() {
        System.out.println("All teacher suppose to be "+behaviour+" with the students");

    }

    public static void main(String[] args) {
        MathTeacher math=new MathTeacher();
        math.behaviourMathTeacher();
        System.out.println(math.major);

        ChemistryTeacher chemistry=new ChemistryTeacher();
        chemistry.behaviourChemistryTeacher();

        PianoTeacher piano=new PianoTeacher();




    }

}

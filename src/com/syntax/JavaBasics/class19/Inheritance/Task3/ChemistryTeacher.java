package com.syntax.JavaBasics.class19.Inheritance.Task3;

public class ChemistryTeacher extends Teacher{
   protected String major="Chemicals";

    protected void behaviourChemistryTeacher() {
        System.out.println("Chemistry teacher is teachimg "+major+
                " for the students. His retirement age and IQ are "
                +retirementAge+" "+IQ);
    }
}

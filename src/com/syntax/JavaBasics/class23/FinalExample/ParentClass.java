package com.syntax.JavaBasics.class23.FinalExample;

public class ParentClass {
    private final String NAME="Fatma";
    protected final int AGEE=20;
    public final double WEIGHT_OF_AVG_HUMAN=30;
    final double HEIGHT=5.4;
    static final int NO_OF_LEGS=2;
    String hairColor;
    private void printName() { //if it's private, no need for final, because it has same behavior
        System.out.println(NAME);
    }
    void printHairColor() {
        System.out.println(hairColor);
    }
    final void printAge() {
        System.out.println(AGEE);
    }
    protected final void printHeight() {
        System.out.println(HEIGHT);
    }
    public final void printWeight() {
        System.out.println(WEIGHT_OF_AVG_HUMAN);
    }
   // public static final void printWeight() {
        //System.out.println(WEIGHT_OF_AVG_HUMAN); //npt allowed, because we can't access from static to instance
    }



class ChildClass extends ParentClass{
    public static void printNoOfLegs() {
        System.out.println("From Child "+NO_OF_LEGS);
       // System.out.println("My hair color is "+printHairColor);
    }
    void printHairColor() {
        System.out.println("Black from Child");
    }

}


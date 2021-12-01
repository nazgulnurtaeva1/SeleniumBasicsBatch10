package com.syntax.JavaBasics.class20;

public class Employee {
    String name;
    int age;
    int baseSalary=30000;
    int baseNoDaysOff=20;

    void printBaseSalary() {
        System.out.println(baseSalary);
    }
    void printNoDayOff() {
        System.out.println(baseNoDaysOff);
    }
    public class Manager extends Employee{
        int bonus=10;         //additional info only for manager
        int travelAllowance=200;

        void printSalary() {
            super.printBaseSalary();
            System.out.println(bonus+travelAllowance);
        }
    }
}

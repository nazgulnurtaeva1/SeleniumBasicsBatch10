package com.syntax.JavaBasics.class17.ReviewAccessModifiersConstructors;

public class Task3 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of
	 * constructors(private,public,default,protected) and create 4 objects of this
	 * class: 1 - inside same class; 2 - from outside the class; 3 - from different
	 * class inside different package and observe result.
     */
    private Task3() {
        System.out.println("1");
    }
    Task3(String name) {
        System.out.println("2");
    }
    protected Task3(int age) {
        System.out.println("3");
    }
    public Task3(double weight) {
        System.out.println("4");
    }




}

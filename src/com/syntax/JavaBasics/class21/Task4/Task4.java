package com.syntax.JavaBasics.class21.Task4;

import com.syntax.JavaBasics.class17.Task;

import java.sql.SQLOutput;

public class Task4 {
    /*
    Create 1 class with a private method that has
     3 overloaded forms. Then call each overloaded
    method with specific arguments and observe
     result.
     */

    private void method() {
        System.out.println("void method");
    }

    private int method(int num) {
        System.out.println("int method");
        return num;
    }
    private int method(String str) {
          System.out.println("atr method");
    return 5;

}

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.method("10");
    }
}

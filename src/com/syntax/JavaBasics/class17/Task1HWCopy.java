package com.syntax.JavaBasics.class17;

public class Task1HWCopy {
    //TASK: Create a method that will accept an array as parameters
    // and will return a sum of all elements from that array.
    // Method should be visibly only within same package and
    // accessible by the creating an instance of the class.

    int arrayParameter (int [] arr) {
        int sum = 0;
        for(int i: arr) {
           sum+=i;
        }
        return sum;
    }


    }

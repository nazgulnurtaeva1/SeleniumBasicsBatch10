package com.syntax.JavaBasics.class16;

public class InstanceVarDemo {

    public static
    int [] arr ={10, 20, 30, 40, 50};
    int sum = 0;

    void Sum() {


        for (int i: arr) {
            sum+=i;
        }
    }
    void CalculateAverage() {
        System.out.println(sum/arr.length);
    }
}

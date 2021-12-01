package com.syntax.JavaBasics.class23.Example1;

import com.syntax.JavaBasics.class23.Example1.Father;
import com.syntax.JavaBasics.class23.Example1.Son;

public class FatherTester {
    public static void main(String[] args) {
        Father son=new Father("Father");
        //Son fath= new Father("SharifsFather");
        Son sharifObj=(Son)son;  //downcasting
    }
}

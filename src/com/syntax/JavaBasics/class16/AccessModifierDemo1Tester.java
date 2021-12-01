package com.syntax.JavaBasics.class16;

import com.syntax.JavaBasics.class17.AccessModifierDemo1;

public class AccessModifierDemo1Tester extends AccessModifierDemo1 {

    void methodInASeparateClass() {
        System.out.println(friend);
        System.out.println(number);
        method2();
        method2(); //only accessible PUBLIC and PROTECTED mod. within the separate package


    }


    public static void main(String[] args) {


        AccessModifierDemo1 accessModifierDemo1 = new AccessModifierDemo1();
        System.out.println(accessModifierDemo1.number); //==> only public can have an access within different packages





    }
}

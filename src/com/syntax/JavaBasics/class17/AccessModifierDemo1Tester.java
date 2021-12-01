package com.syntax.JavaBasics.class17;

public class AccessModifierDemo1Tester {
    public static void main(String[] args) {

        AccessModifierDemo1 accessModifierDemo1 = new AccessModifierDemo1();

       // System.out.println(accessModifierDemo1.secondName);
        // can't have an Access, because the field is private
        System.out.println(accessModifierDemo1.friend);
        //Protected access modifier
        System.out.println(accessModifierDemo1.name);
        //Can have an Access because it's not private and has DEFAULT
// we can access it inside same package as well

        accessModifierDemo1.method1(); //DEFAULT
        accessModifierDemo1.method3(); //PUBLIC
      //  accessModifierDemo1.method4();  //PRIVATE
        //error because method4() is private
        accessModifierDemo1.method2(); //Protected





    }
}

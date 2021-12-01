package com.syntax.JavaBasics.class17;

public class AccessModifierDemo1 {

    private String secondName = "Nurtay";  //==> Private ==>  We can Access to Private within the same CLASS with creating an Object or without
    String name; //===> Default  //==> We can Access within same PACKAGE with creating an Object or without

    public int number; //==> Public
    protected String friend;

    void method1() {
        System.out.println(name);
        System.out.println(secondName);

    }
    protected void method2() {
        System.out.println(name);
        System.out.println(secondName);
        System.out.println(friend);
        System.out.println(number);
        method1();
        method3();
      //  method4(); ===> Private method
        System.out.println(friend);
        System.out.println(number);
        System.out.println(name);
        System.out.println(secondName);
    }
    public void method3() {
        System.out.println(number);
        System.out.println(name);
        System.out.println(secondName);
        System.out.println(friend);
        method4();
    }
    private void method4() {
        method1();
        method3();
        System.out.println(name);
        System.out.println(secondName);
        System.out.println(friend);
        System.out.println(number);
    }





    public static void main(String[] args) {
        AccessModifierDemo1 accessModifierDemo1 = new AccessModifierDemo1();
        System.out.println(accessModifierDemo1.name);
        System.out.println(accessModifierDemo1.secondName);

    }

}

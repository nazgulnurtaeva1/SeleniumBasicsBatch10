package com.syntax.JavaBasics.class16;

public class SyntaxStudent {

    static String schoolName = "Syntax";
    static int courseDuration = 6;
    String name;
    String id;
    int age;

    double CalculateFee() {
        int var1 = 10;
        int var2 = 20;
        name ="Naz";
        System.out.println(name);

        return  var1 * var2 + 100;
    }
void DisplayFee() {
        name = "Not Blabla";  //===>  we can access from one method variable to another one
    System.out.println(name+" has to pay "+CalculateFee());

}


}

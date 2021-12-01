package com.syntax.JavaBasics.class18;

public class ReplitTaskFindGreaterAlphabet {
    /* TASK:
    Create a method that will be available to all classes in your project with following specifications:
//To find which Alphabet or character greater, we are going to use ASCII table
Returns:
a String
Name:
alphabetical
Parameters:

a String called str
a String called str
Purpose:

Return a string that is composed of each letter as long as the letter is later on in the alphabet
Return a string that is composed of each letter as long as the letter is later on in the alphabet
than its previous one.  You can assume actual parameters are lowercase.
See below examples.
than its previous one.  You can assume actual parameters are lowercase.
See below examples.
Additional Info:

You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater". Examples:

'a' < 'b' ==> True
'a' < 'b' ==> True
'a' < 'a' ==> False
'a' < 'a' ==> False
'a' > 'b' ==> False
'a' > 'b' ==> False
Examples:

alphabetical("hello") ==> "hlo"
alphabetical("hello") ==> "hlo"
alphabetical("software") ==> "stwr"
alphabetical("software") ==> "stwr"
alphabetical("language") ==> "lnug"
alphabetical("language") ==> "lnug"
Expected Output:

hlo
stwr
lnug

     */


    public static String alphabetical(String str) {
        String newStr = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) < str.charAt(i)) {
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;


    }

    public static void main(String[] args) {
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));


    }
}
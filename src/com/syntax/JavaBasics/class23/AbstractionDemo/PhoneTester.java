package com.syntax.JavaBasics.class23.AbstractionDemo;

public class PhoneTester {
    public static void main(String[] args) {
//Phone phone =new Phone(); //we can't create an obj, its
// has not completed method

        Iphone iphone =new Iphone();
        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();

        Samsung samsung=new Samsung();
        samsung.displayPictures();
        samsung.makePhoneCalls();
        samsung.unlockPhone();
        samsung.sendText();

        Phone[] phones={new Iphone(), new Samsung()};
        for(Phone ph:phones) {
            ph.displayPictures();
            ph.makePhoneCalls();
            ph.unlockPhone();
            ph.sendText();
        }
    }
}

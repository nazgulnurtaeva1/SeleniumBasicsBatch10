package com.syntax.JavaBasics.class22;

public class WebDriver {
    void openWebsite() {
        System.out.println("Opening a website");
    }
    void signup() {
        System.out.println("Sign up on the website");
    }
    void login() {
        System.out.println("login to website");
    }
    void enterUserPassword() {
        System.out.println("Clicking on submit button");
    }
    void closeBrowser() {
        System.out.println("Closing the browser");
    }
}

class GoogleChrome extends WebDriver {
    void openWebsite() {
        System.out.println("Opening a website in Google Chrome");
    }
    void signup() {
        System.out.println("Sign up on the website in Google Chrome");
    }
    void login() {
        System.out.println("login to website in Google Chrome");
    }
    void enterUserPassword() {
        System.out.println("Clicking on submit button in Google Chrome");
    }
    void closeBrowser() {
        System.out.println("Closing the browser in Google Chrome");
    }
}

class Firefox extends WebDriver {
    void openWebsite() {
        System.out.println("Opening a website in Firefox");
    }
    void signup() {
        System.out.println("Sign up on the website in Firefox");
    }
    void login() {
        System.out.println("login to website in Firefox");
    }
    void enterUserPassword() {
        System.out.println("Clicking on submit button in Firefox");
    }
    void closeBrowser() {
        System.out.println("Closing the browser in Firefox");
    }
}

class Safari extends WebDriver {
    void openWebsite() {
        System.out.println("Opening a website in  Safari");
    }

    void signup() {
        System.out.println("Sign up on the website in  Safari");
    }

    void login() {
        System.out.println("login to website in  Safari");
    }

    void enterUserPassword() {
        System.out.println("Clicking on submit button in  Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the browser in  Safari");
    }
}

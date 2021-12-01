package com.syntax.JavaBasics.class24.Task1;

public class WebDriverTester {

    public static void main(String[] args) {
        //to create an Array
        WebDriver[] webDrivers={new FirefoxDriver(), new ChromeDriver()};
        for(WebDriver webD: webDrivers) {
            webD.openBrowser();
            webD.closeBrowser();
            webD.maximizeWindow();
            webD.findElement();
        }
    }
}

package com.syntax.JavaBasics.class22;

public class WebDriverTester {
    public static void main(String[] args) {
        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signup();
        googleChrome.login();
        googleChrome.enterUserPassword();
        googleChrome.closeBrowser();

WebDriver[] webDrivers={new GoogleChrome(), new Firefox(), new Safari()};
for (WebDriver wd:webDrivers) {
    wd.openWebsite();
    wd.enterUserPassword();
    wd.login();
    wd.signup();
}
//GoogleChrome googleChrome1=new WebDriverTester();  not Allowed, cause it's downCastong
WebDriver webDriver=new GoogleChrome();
GoogleChrome chrome=(GoogleChrome) webDriver;
    }
}

package com.syntax.JavaBasics.class24.Task1;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following
    unimplemented behaviour: openBrowser(), closeBrowser(),
     maximizeWindow(), findElement(). Create 2 classes
     that implements WebDriver interface: ChromeDriver
      and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the window");
    }

    @Override
    public void findElement() {
        System.out.println("Find the elements");
    }

}

class  FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox Open Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox Close Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("FindElement Firefox");
    }
}

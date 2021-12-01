package com.syntax.Selenium.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("My title is "+title);
        if(title.equals("Facebook - Log In or Sign Up")) {
            System.out.println("Title is Correct");
        } else {
            System.out.println("Title is wrong");
        }


    }
}

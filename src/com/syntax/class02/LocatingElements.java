package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fb.com");
        driver.findElement(By.id("email")).sendKeys("nazgulnurtaeva1@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Farabi081520!");
driver.findElement(By.name("login")).click();
Thread.sleep(2000);
//driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();

    }
}

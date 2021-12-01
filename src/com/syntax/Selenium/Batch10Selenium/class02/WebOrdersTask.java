package com.syntax.Selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebOrdersTask {

    public static void main(String[] args) {
        String setProperty = System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
       // driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("nazgulnurtaeva1@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Farabi081520!");
driver.findElement(By.name("login")).click();
driver.quit();
    }


}

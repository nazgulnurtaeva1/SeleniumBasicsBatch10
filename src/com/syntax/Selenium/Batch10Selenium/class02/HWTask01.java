package com.syntax.Selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.id("customer.firstName")).sendKeys("Nazgul");
        driver.findElement(By.id("customer.lastName")).sendKeys("Nurtay");
        driver.findElement(By.id("customer.address.street")).sendKeys("1630 Lakeshore pr Circle");
        driver.findElement(By.id("customer.address.city")).sendKeys("Casselberry");
        driver.findElement(By.id("customer.address.state")).sendKeys("Fl");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("32707");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(" P9992889398");
        driver.findElement(By.id("customer.ssn")).sendKeys("272736456");
        driver.findElement(By.id("customer.username")).sendKeys("naz2711");
        driver.findElement(By.id("customer.password")).sendKeys("Farabi0815");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Farabi0815");
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("username")).sendKeys("naz2711");
        driver.findElement(By.name("password")).sendKeys("Farabi0815");
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}

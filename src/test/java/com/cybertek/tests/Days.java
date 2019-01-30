package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;


@Test
public class Days {
    WebDriver driver;

    @Test
    public void dayTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");


        int fridayCount = 0;
        while (fridayCount < 3) {
            Random randomObject = new Random();
            int random = randomObject.nextInt(8);
            switch (random) {
                case 1:
                    WebElement mondayElement = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
                    mondayElement.click();
                    Thread.sleep(200);
                    System.out.println("Monday");
                    mondayElement.click();
                    Thread.sleep(200);
                    break;
                case 2:
                    WebElement tuesdayElement = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
                    tuesdayElement.click();
                    Thread.sleep(200);
                    System.out.println("Tuesday");
                    tuesdayElement.click();
                    Thread.sleep(200);
                    break;
                case 3:
                    WebElement wednesdayElement = driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-input"));
                    wednesdayElement.click();
                    Thread.sleep(200);
                    System.out.println("Thursday");
                    wednesdayElement.click();
                    Thread.sleep(200);
                    break;
                case 4:
                    WebElement thursdayElement = driver.findElement(By.id("gwt-debug-cwCheckBox-Thursday-input"));
                    thursdayElement.click();
                    Thread.sleep(200);
                    System.out.println("Thursday");
                    thursdayElement.click();
                    Thread.sleep(200);
                    break;
                case 5:
                    WebElement fridayElement = driver.findElement(By.id("gwt-debug-cwCheckBox-Friday-input"));
                    fridayElement.click();
                    Thread.sleep(200);
                    System.out.println("Friday");
                    fridayElement.click();
                    Thread.sleep(200);
                    fridayCount++;
                    break;
                case 6:
                    WebElement saturdayElement = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
                    saturdayElement.click();
                    Thread.sleep(200);
                    System.out.println("Saturday is disabled");
                    saturdayElement.click();
                    Thread.sleep(200);
                    break;
                case 7:
                    WebElement sundayElement = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
                    sundayElement.click();
                    Thread.sleep(200);
                    System.out.println("Sunday is disabled");
                    sundayElement.click();
                    Thread.sleep(200);
                    break;
            }

        }

        driver.quit();


    }
}
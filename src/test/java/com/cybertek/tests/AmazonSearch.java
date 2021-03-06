package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. open browser
2. go to amazon
3. enter search term and submit
4. verify search box still contains the same search term
 */
public class AmazonSearch {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // get --> go to some url
        driver.get("https://amazon.com");

        String searchterm = "wooden spoon";
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys(searchterm+ Keys.ENTER);

        String actual = driver.
                findElement(By.id("twotabsearchtextbox"))
                .getAttribute("value");

        if (searchterm.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("searchterm = " + searchterm);
        }

    }

}
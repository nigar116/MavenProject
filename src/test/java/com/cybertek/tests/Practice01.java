package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 {

    public static void main(String[] args) {
        /*1:Search Amazon
        1.Open browser
        2:Go to http://amazon.com
        3:Enter any search item
        4:Click on search button
        5;Varify contains the search item
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http:amazon.com");//url address
        WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("charger" + Keys.ENTER);

        String expected = "charger";
        String actual = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
        if(actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual =" +actual);
            System.out.println("expected =" + expected) ;
        }
        driver.close();



    }


}

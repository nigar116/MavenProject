package com.cybertek.tests;

import com.cybertek.utilites.TestBase;
import com.cybertek.utilites.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WebTableExample extends TestBase {
    @Test
    public void changeTab() {
        driver.get("http://the-internet.herokuapp.com/windows");
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getWindowHandle());

        driver.findElement(By.linkText("Click Here")).click();


        System.out.println(driver.getWindowHandles().size());


        //TODO switch to new tab

        Set<String> windowsHandles = driver.getWindowHandles();
        System.out.println("*****************");


        for (String handle : windowsHandles) {
            System.out.println(handle);
            //TODO WE ARE SWITCHING TABS
            driver.switchTo().window(handle);

            System.out.println(driver.getTitle());

            if (driver.getTitle().equals("New Window")) {
                break;
            }
        }


        Assert.assertEquals(driver.getTitle(), "New Window");
        Assert.assertNotEquals(driver.getTitle(), "The Internet");


    }

    /*
        TODO 1
        go to https://www.w3schools.com/html/ URL
        click on Try it Yourself »
        Verify the url of the new tab contains "default"
     */


    //TODO 2
    //title of the second Tryit Editor v3.6
    //get all all handles
    //switch one by one
    //if the title is the right, break the loop


    @Test
    public void changeTab2() {
        driver.get("https://www.w3schools.com/html/");
        driver.findElement(By.linkText("Try it Yourself »")).click();


        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);

            if (driver.getTitle().equals("Tryit Editor v3.6")) {
                break;
            }
        }

        Assert.assertTrue(driver.getCurrentUrl().contains("default"));


        System.out.println(driver.getWindowHandles().size());
        driver.close();

        System.out.println(driver.getWindowHandles().size());

    }


}
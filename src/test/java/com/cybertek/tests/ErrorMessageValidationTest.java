package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.utilites.ConfigurationReader;
import com.cybertek.utilites.TestBase;
import com.cybertek.utilites.ConfigurationReader;
import com.cybertek.utilites.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.security.Permission;

public class ErrorMessageValidationTest extends TestBase {
    ///HomePage homePage=new HomePage();
    @Test
    public void wrongEmailTest() {
        HomePage homePage = new HomePage();
        //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.get(ConfigurationReader.getProperty("url"));
       /*
       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");
       driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
       driver.findElement(By.id("ctl00_MainContent_login_button")).click();
       */
        homePage.username.sendKeys("admin");
        homePage.password.sendKeys("test");
        homePage.longinbutton.click();
        String error = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, error);
    }

    @Test
    public void wrongPasswordTest() {
        HomePage homePage = new HomePage();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
       /*
       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
       driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("wrongPassword");
       driver.findElement(By.id("ctl00_MainContent_login_button")).click();
*/
        homePage.username.sendKeys("admin");
        homePage.password.sendKeys("test");
        homePage.longinbutton.click();
        String expectedError = "Invalid Login or Password.";
        //String actualError=driver.findElement(By.id("ctl00_MainContent_status")).getText();
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, expectedError);
    }

    @Test
    public void blankUsername() {
        HomePage homePage = new HomePage();
        //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.open();
        homePage.login("", "test");
        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, expectedError);
    }
/*
   @Test
   public void test(){
       HomePage homePage=new HomePage();
       PrestonshopHomePage prestonshopHomePage=new PrestonshopHomePage();
       WebElement tshirt=prestonshopHomePage.product("tshirt");
       WebElement dress=prestonshopHomePage.product("dress");
   }
   */
}


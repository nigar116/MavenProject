package com.cybertek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cybertek.utilites.driver;

import java.sql.Driver;


public class HomePage {

    public HomePage(){
        PageFactory.initElements(driver.getDriver(), this);

    }


 //annotation from selenium
 @FindBy(id="ctl00_MainContent_username")
    public WebElement username;

 @FindBy(id ="ctl00_MainContent_password")
    public WebElement password;

 @FindBy(id = "ctl00_MainContent_Login_button")
    public WebElement longinbutton;

 @FindBy(id ="ctl00_MainContent_status")
    public WebElement errorMessage;

    public void login(String usrname, String passwd) {
        username.sendKeys(usrname);
        password.sendKeys(passwd);
        longinbutton.click();

    }

    public void open(){
        driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    }

}

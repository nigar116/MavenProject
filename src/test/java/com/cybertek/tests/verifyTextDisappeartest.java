package com.cybertek.tests;

import com.cybertek.utilites.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyTextDisappeartest extends TestBase {

    @Test

    public void verify1(){
        driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
        WebElement text = driver.findElement(By.id("myDIV"));

     //assertTrue => expected the condition to return ture;

        Assert.assertTrue(text.isDisplayed());

        WebElement button = driver.findElement(By.xpath("//button[.='Toggle Hide and Show']"));

        button.click();
        Assert.assertFalse(text.isDisplayed());




    }

   @Test
    public void varify2(){
        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");

        driver.switchTo().frame("iframeResult");

        WebElement text = driver.findElement(By.xpath("//body/p"));
        //System.out.println(text.getText());
       Assert.assertTrue(text.isDisplayed());

       WebElement button = driver.findElement(By.xpath("//body/button"));
       button.click();

   }

    /**
     * takes a locator and returns if elemnts matching this locator exists
     * @param by
     * @return
     */

   public  boolean elementDisplayed(By by){
       //try find it
       //if cant find it ,return false

       try{
           driver.findElement(by);
           return  true;
       }catch (NoSuchElementException e){
           return false;
       }



   }





}

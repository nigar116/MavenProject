package com.cybertek.utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driver {

    private static WebDriver driver;
    private  driver(){}

    public static WebDriver getDriver() {
        if (driver == null) {
           String browser =ConfigurationReader.getProperty("browser");
           switch (browser){
               case "chrome":
               WebDriverManager.chromedriver().setup();
               driver =new ChromeDriver();
               break;
               case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               break;
               case "ie":
                   WebDriverManager.iedriver().setup();
                   driver =new InternetExplorerDriver();
                   break;



           }

        }

     return  driver;
    }

    public  static  void  closeDriver(){
        if(driver!= null){
            driver.quit();
            driver=null;
        }
    }


    }



//driver.close();close all the open windows, but does not make the object null .
//we need the make the object  ull, we need to make the object null







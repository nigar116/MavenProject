package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.utilites.ConfigurationReader;
import com.cybertek.utilites.TestBase;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase {

    @Test
    public void readPrpertyTest(){
        String browser = ConfigurationReader.getProperty("urfl");
        HomePage homePage = new HomePage();
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        homePage.login(username,password);

        System.out.println(browser);
    }
}

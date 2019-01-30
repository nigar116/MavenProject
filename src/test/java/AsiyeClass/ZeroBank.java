package AsiyeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {

        /*
        Basic authentication Zero bank
        1.Open browser
        2.Go to http://zero.webappsecurity.com/login.html
        3.Enter username username
        4.Enter password password
        5.Click sign in button
        6.Verify usernameis displayed on page
        7.Verifythe title Zero -Account Summary
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        String expect = "username";
        String actual = driver.findElement(By.linkText("username")).getText();
        if (expect.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expect result :" + expect);
            System.out.println("actual result " + actual);


        }

        String expect2 ="Zero - Account Summary";//verify the title
        String actual2 =driver.getTitle();
        if (expect2.equals(actual2)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expect2 result :" + expect2);
            System.out.println("actual2 result " + actual2);


        }

    }
}

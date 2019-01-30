package AsiyeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressBook {
    public static void main(String[] args) {
        /*
        Basic authentication Address book
        1.Open browser
        2.Go tohttp://a.testaddressbook.com/sign_in
        3.Enter username kexesobepu@zsero.com
        4.Enter password password
        5.Click sign in button6.Verify username is displayed on page7.
        Verifythe title does not include Sign In
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to the website you need
        driver.get("http://a.testaddressbook.com/sign_in");
        //enter user name kexesobepu@zsero.com

                                                 //the username you want to enter with sendkey method

       // driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("kexesobepu@zsero.com");//this is the second way ,which works same

        //enter passsword
        driver.findElement(By.id("session_password")).sendKeys("password");

        //click singin button
        driver.findElement(By.name("commit")).click();
        //Verify  the title does not include Sign In

       String expect = "kexesobepu@zsero.com";
       String actual = driver.findElement(By.className("navbar-text")).getText();
       if(expect.equals(actual)){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
           System.out.println("expect result :" + expect);
           System.out.println("actual result " + actual);


           System.out.println("asiye is the best ");

       }












    }
}

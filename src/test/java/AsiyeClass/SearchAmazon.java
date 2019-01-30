package AsiyeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmazon {
    public static void main(String[] args) {

        /*
        Search Amazon
        1.Open browser
        2.Go to https://amazon.com
        3.Enter any search term
        4.Click on search button
        5.Verifytitle contains the search term
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //1.Open browser
        //2.Go to https://amazon.com
        driver.get("https://amazon.com");
        //3.Enter any search term
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("carseat");
        driver.findElement(By.className("nav-input")).click();
        //5.Verifytitle contains the search term
        String expect ="carseat";
        String actual = driver.findElement(By.id("twotabsearchtextbox")).getText();




    }
}

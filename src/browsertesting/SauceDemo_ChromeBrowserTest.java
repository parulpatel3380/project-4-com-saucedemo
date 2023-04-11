package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemo_ChromeBrowserTest {
    public static void main(String[] args) {


        String baseUrl = "https://www.saucedemo.com/";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open the Url in Chrome browser
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        //Giving implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        //Printing statement
        System.out.println(title);
        //Get the current Url
        System.out.println("Current Url :" +driver.getCurrentUrl());
        //Get the Page source
        System.out.println("Page Source :" + driver.getPageSource());

        //Find the username field element
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Find the password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

    }
}
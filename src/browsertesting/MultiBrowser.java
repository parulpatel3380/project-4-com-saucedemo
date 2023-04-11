package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";

    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        String baseUrl = "https://www.saucedemo.com/";

        //Open the Url into browser
        driver .get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of page
        String title = driver.getTitle();
       // print statemnet
        System.out.println("Title");

        //Get the current Url
        System.out.println("Current Url:" +driver.getCurrentUrl());

        //Get page source
        System.out.println("PageSource:" +driver.getPageSource());

        //Find the username field element
        driver.findElement(By.id("user-name")).sendKeys("sameuser");

        // Find the passwordfield
        driver.findElement(By.id("password")).sendKeys("123_patel");

        driver.close();
    }
}

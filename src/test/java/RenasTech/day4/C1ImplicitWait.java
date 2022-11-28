package RenasTech.day4;

import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class C1ImplicitWait {
    public static void main(String[] args) {
        /*
        open browser
        go to the page https://vinexponewyork.com
        click on attend button
         */
        WebDriver driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("https://vinexponewyork.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        /*
        we are giving an option to driver to wait until the page is loaded
        but in the thread doesnt wait page to be loaded .

         */
        driver.findElement(By.cssSelector("a[href='/attend/']")).click();






    }

}

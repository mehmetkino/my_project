package RenasTech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1NameLocator {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        //1- open chrome browser
        //2- click the gmail link

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(2000);

       //finding element by using linkText locator// href link
        //driver.findElement(By.linkText("Gmail")).click();

      //finding element by partialLinkText("Gma")
       // driver.findElement(By.partialLinkText("Gma")).click();

        //finding element by classname locator
        driver.findElement(By.className("gb_d")).click();

        driver.close();



    }
}

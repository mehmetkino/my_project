package Practices.DAY1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2CodeLocators {
    public static void main(String[] args) throws InterruptedException {
        //1-Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- go to google.com
        driver.get("https://google.com");

        //3- write orange in the search box
        //we found google search box element using name locator

        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("Orange");
        Thread.sleep(4000);

        //click google search button
        WebElement searchbutton= driver.findElement(By.name("btnK"));

        searchbutton.click();





    }
}

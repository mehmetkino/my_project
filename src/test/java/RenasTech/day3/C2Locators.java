package RenasTech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2Locators {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.get("https://www.amazon.com");

        //findelement by using id element
        WebElement s=driver.findElement(By.id("twotabsearchtextbox"));
        s.sendKeys("laptop");
        Thread.sleep(2000);

        //finding search button here.
        //driver.findElement(By.id("nav-search-submit-button")).click();

        //finding element by using Xpath locator //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@type='submit']")).click();


        driver.close();












    }
}

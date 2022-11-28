package RenasTech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3XpathLocator {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.guru99.com/");
        Thread.sleep(3000);

        WebElement header= driver.findElement(By.xpath("//b[.='Testing']"));
        header.click();


    }

}

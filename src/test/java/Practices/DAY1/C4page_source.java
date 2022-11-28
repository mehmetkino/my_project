package Practices.DAY1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4page_source {

    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rediff.com");

        //we need to determine title of this page

       driver.getPageSource();
        System.out.println("this is page source" + driver.getPageSource());


    }

}

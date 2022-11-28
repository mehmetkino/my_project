package Practices.DAY1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2classwork {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://openweathermap.org/");

        //we need to determine title of this page

        String title= driver.getTitle();

        System.out.println("this is the title:" +title);

        System.out.println("The url of this page is: "+driver.getCurrentUrl());

    }
}

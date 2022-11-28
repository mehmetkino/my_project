package RenasTech.day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1HelloSelenium {
    public static void main(String[] args) {
        //create connection between selenium and browser
        //set-up

        WebDriverManager.chromedriver().setup();

        //create object of chrome driver

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        System.out.println("The current Url is: " +driver.getCurrentUrl());







    }
}

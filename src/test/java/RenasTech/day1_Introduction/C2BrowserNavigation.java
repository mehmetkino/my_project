package RenasTech.day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");
        Thread.sleep(4000);


        driver.get("https://facebook.com");
        Thread.sleep(4000);

        driver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://apple.com");

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();




        //driver.quit();

        driver.close();





    }
}

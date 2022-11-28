package RenasTech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3GittiGidiyor {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.navigate().to("https://www.hepsiburada.com");
        Thread.sleep(2000);
        driver.navigate().back();

        driver.get("https://www.ciceksepeti.com");

        Thread.sleep(4000);

        driver.close();





    }

}

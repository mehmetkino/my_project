package Practices.DAY1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C3Opening_Browser {

    public static WebDriver driver;
    static String Browser1= "edge";
    static String Browser2= "chrome";

    public static void main(String[] args) {

        if(Browser2.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://etsy.com");

        }
        else if(Browser1.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://amazon.com");

        }
        else{
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://rediff.com");

        }
    }
}

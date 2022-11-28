package RenasTech.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverUtil {
    //to be able to achive singleton design pattern we will
    //need to have private constructor
    //no one can be able to create object from thiss class

    private DriverUtil(){

    }
    private static WebDriver driver;
    //we are using encapsulation logic in here by making driver private
    //we will need to  create getter and setter method for driver

    public static WebDriver getDriver(){
        if (driver== null){
            String browser= PropertiesReadingUtil.getProperties("browser");

            switch(browser){
                case"Chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;

                case"Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;

                case"chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case"firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;


            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }







}

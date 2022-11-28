package RenasTech.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtility {
    //create a util that takes browser type and
    //create connection between browser and webdriver

    public static WebDriver getDriver(String Browser){
        //Setup chrome driver
        if(Browser.equals("Chrome")){

        WebDriverManager.chromedriver().setup();

        return new ChromeDriver();


    }else{
             WebDriverManager.firefoxdriver().setup();
             return new FirefoxDriver();
        }

        }



}





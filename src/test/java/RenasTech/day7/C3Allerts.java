package RenasTech.day7;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C3Allerts {
    /**
     *
     */


    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://renas-practice.herokuapp.com/home");

    }
    @Test
    public void Testcase1_AlertPractice(){
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("Alert BoxI")).click();

        WebElement alertButton= driver.findElement(By.id("alert-demo"));
        alertButton.click();

        //Below shows how to handle an alert
        //first create an object of alert and
        //either you can accept alert by clciking okey
        //or dismiss it .

        Alert alert= driver.switchTo().alert();
        alert.accept();//will click on OK
        BrowserUtils.wait(2);

        alertButton.click();
        alert.dismiss(); //will dismiss the alert
        BrowserUtils.wait(3);
        





    }

}

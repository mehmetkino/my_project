package RenasTech.day7;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C4Iframes {

    //1-open a chrome browser
    //2-go to : http://the-internet.herokuapp.com/iframe
    //3- switching by id or name attribute value

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void Testcase1_Iframe(){
        //iframe is like a page inside a page. so in order to acces
        //that iframe page we have to switch our driver to iframe
        //we can locate only by id or name attribute value

        driver.switchTo().frame("mce_0_ifr");
        WebElement msgBox= driver.findElement(By.id("tinymce"));
        msgBox.clear();
        BrowserUtils.wait(2);// wait 2 seconds
        msgBox.sendKeys("You are the best");

        driver.switchTo().defaultContent();// return to main html, usuallly go with this
        //driver.switchTo().parentFrame();// return to previous html block

    }
}

package RenasTech.day10_Actions;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.DriverUtil;
import RenasTech.base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class C2Dropdown extends TestBase2 {
    WebDriver driver;

    @Test
    public void Testcase1(){
        DriverUtil.getDriver().get("https://exchange.gemini.com/register/institution/admin");
        //in order to change location i have to scroll down a little
        BrowserUtils.wait(2);
        JavascriptExecutor js=(JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy('0','800')");
        //WebElement changelocation=DriverUtil.getDriver().findElement(By.id("locationButton"));
        //changelocation.click();
    }


}

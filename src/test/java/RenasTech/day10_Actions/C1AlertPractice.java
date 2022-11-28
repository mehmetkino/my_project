package RenasTech.day10_Actions;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.DriverUtil;
import RenasTech.Utilities.WebDriverUtility;
import RenasTech.base.TestBase2;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C1AlertPractice {
    WebDriver driver;

    /**
     * go to https://the-internet.herokuapp.com/
     * click on JavaScript Alerts
     * click for js prompt
     * enter "hello world" text
     * click okey
     * validate your text appering on the page
     *
     */

    @Test
    public void Testcase1_AlertPractice(){
         driver= WebDriverUtility.getDriver("Chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get("https://the-internet.herokuapp.com/");

         //scrolldown to jsAlerts button
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy('0','800')");
        BrowserUtils.wait(2);


        //find the element store it in a WebElement then click it
        WebElement alertButton= driver.findElement(By.xpath("//a[.='JavaScript Alerts']"));
        alertButton.click();

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        BrowserUtils.wait(2);

        //switch to prompt
        Alert prompt= driver.switchTo().alert();
        String word= "Hello World";
        prompt.sendKeys(word);
        BrowserUtils.wait(5);

        prompt.accept();

        //last step: validate if hello world result is there
        WebElement actualText= driver.findElement(By.id("result"));

        Assert.assertTrue(actualText.getText().contains(word));






    }
}

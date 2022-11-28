package RenasTech.Assertion;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C1Verification {

    WebDriver driver;

    @BeforeMethod
    public void titleTest() throws InterruptedException {
        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com");

        String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";

        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle,expectedTitle);
        Thread.sleep(2000);



    }
    @Test
    public void Testcase2_laptop(){
       WebElement searchBox= driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.click();
        searchBox.sendKeys("Macbook pro");

        Select categories= new Select(driver.findElement(By.id("gh-cat")));
        categories.selectByIndex(7);
        BrowserUtils.wait(2);
        driver.findElement(By.id("gh-btn")).click();

        WebElement radioBox= driver.findElement(By.xpath("(//input[@class='checkbox__control'])[2]"));

        radioBox.click();
        driver.close();




    }

}

package RenasTech.day5;

import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C2GoogleTestNG {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //this aanotation will apply all of your test cases
        ////so it is better to use common steps

        driver = WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }
    @Test(priority = 1)
    public void Tc1_GoogleVerifyTitle(){
        System.out.println("Test case 1 is running");
        WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("laptop", Keys.ENTER);
        String actualTitle=driver.getTitle();
        String containedTitle= "Laptop";
        boolean b= actualTitle.contains(containedTitle);

        //if assertion is failed the message will print out.
        Assert.assertTrue(b,"search function has failed ");


    }
    @AfterMethod
    public void closing(){
        driver.quit();

    }





}

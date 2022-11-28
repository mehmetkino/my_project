package RenasTech.Assertion;

import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class C2SoftAssertion {
    /*
    -in hard assertion script stops executing when it fails. lets say you have 2 assertion one of them
    fails but the other one is okey but it is not going to execute right? if you want to see both of your verifications
    you can with softassert
    syntax= SoftAssert softassert= new SoftAssert();

    --but in softassert, when you execute it will shol you green at the end
    if you want to see what testcase or assertion has failed you have to pu:softassert.assertAll(); at the end of
    you code


     */

    WebDriver driver;

    @Test
    public void titleTest() throws InterruptedException {
        driver = WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com");

        SoftAssert soft= new SoftAssert();

        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitle = driver.getTitle();

        System.out.println("Verifying title has started");
        soft.assertEquals(actualTitle,expectedTitle,"Title verification has failed!");
        System.out.println("Title verification got executed");


        String expectedUrl="https://www.ebay.com.com/";
        String actualUrl=driver.getCurrentUrl();

        System.out.println("Url verification has started");
        soft.assertEquals(actualUrl,expectedUrl,"The Url verification has faield!");
        System.out.println("Url verification got executed");

        String actualText = driver.findElement(By.id("gh-btn")).getAttribute("value");
        String expectedText= "Searchi";

        System.out.println("Text verification has started");
        soft.assertEquals(actualText,expectedText, "Text verification has failed");
        System.out.println("Text verification got executed");

        soft.assertAll();






    }
}

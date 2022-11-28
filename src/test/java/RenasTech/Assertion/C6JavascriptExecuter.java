package RenasTech.Assertion;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C6JavascriptExecuter {
    public static WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");

    }
    @Test
    public void Testcase1(){
        //login information
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();


        //click on product container
        Select sl= new Select(driver.findElement(By.className("product_sort_container")));
        sl.selectByIndex(2);// price low to high selected

        //scroll down the page
        //we need to use jsexecuter here, it is inbuilt package
        BrowserUtils.wait(3);

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");


        //click on add cart for "Sauce Labs Fleece Jacket"
        WebElement addcartButton= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        addcartButton.click();
        BrowserUtils.wait(2);

       //scroll up to click the car icon
        js.executeScript("window.scroll(0,-1000)");
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        driver.close();






    }
}

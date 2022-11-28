package RenasTech.day7;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.WebDriverUtility;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C1Revision {

    public static WebDriver driver;

    @BeforeTest
    public void setUp(){
       driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void Testcase1_Login(){
       WebElement username= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
       username.sendKeys("Tester");


       WebElement password= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
       password.sendKeys("test");
        BrowserUtils.wait(3);

       driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        BrowserUtils.wait(3);
       driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();


    }
    @Test
    public void Testcase2_ProductInfo(){
        Select screensaver= new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        screensaver.selectByIndex(2);

        //set quantity as a 5.
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        //quantity.clear(); this method did not work
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("5");

       WebElement price= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice"));
       price.clear();
       price.sendKeys("20");

       WebElement discount= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount"));
       discount.sendKeys(Keys.BACK_SPACE);
       discount.sendKeys("1");

       WebElement total= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal"));
       total.clear();
       total.sendKeys("200");
       BrowserUtils.wait(3);

       driver.findElement(By.xpath("//input[@type='submit']")).click();



    }
    @Test
    public void Testcase3_CustomerInfo(){

        Faker faker = new Faker();
        WebElement customername=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        customername.sendKeys(faker.name().fullName());

        WebElement street =driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        street.sendKeys(faker.address().streetAddress());

        WebElement city= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        city.sendKeys(faker.address().cityName());

        WebElement state= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        state.sendKeys(faker.address().state());

        WebElement zipcode= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zipcode.sendKeys(faker.address().zipCode().replaceAll("-",""));
        BrowserUtils.wait(3);


    }
    @Test
    public void Testcase3_Payment(){
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();// visa selected

        WebElement cardNumber= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
       Faker faker= new Faker();
       cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

       driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/21");

       driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

       WebElement display= driver.findElement(By.xpath("//strong"));
        Assert.assertTrue(display.equals("New order has been successfully added."));


    }
    @Test
    public void logout(){
        BrowserUtils.wait(2);
        driver.findElement(By.id("ctl00_logout")).click();
        driver.close();


    }

}

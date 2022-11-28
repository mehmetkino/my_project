package RenasTech.day6;


import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.SmartBearLoginUtils;
import RenasTech.Utilities.WebDriverUtility;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C3SmartBearTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //1-login
        SmartBearLoginUtils.loginForSmartBear(driver);
    }
    @Test
    public void Testcase1_ClickOnOrder(){
    //2-click on order

    WebElement orderLink= driver.findElement(By.xpath("//a[.='Order']"));
    orderLink.click();

    //3-selecet FamilyAlbum from product, set qunatity to 5

        Select dropdownProduct= new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        dropdownProduct.selectByVisibleText("FamilyAlbum");

        WebElement quantity= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        //quantity.clear(); clears the input if this method doesnt work we can use below method
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("5");

    //4- click to calculate button
        WebElement calculateButton= driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

    //Customer info
    //5-fill out address info with javafaker
    Faker faker=new Faker();
    WebElement customerName= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
    WebElement street= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
    WebElement city= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
    WebElement state= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
    WebElement zip= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

    customerName.sendKeys(faker.name().fullName());
    street.sendKeys(faker.address().streetAddress());
    city.sendKeys(faker.address().cityName());
    state.sendKeys(faker.address().state());
    zip.sendKeys(faker.address().zipCode().replaceAll("-",""));
    BrowserUtils.wait(2);//wait time

    //driver.close();

        // Payment Info
    //6- click on Visa radio button
        BrowserUtils.wait(2);
    WebElement visaButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
    visaButton.click();

    WebElement cardNumber= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
    cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

    WebElement expireDate= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1"));
    expireDate.sendKeys("02/24");

    //7-Click on process
        WebElement process= driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        process.click();

    //Verify "New order has been successfully added." is displayed
        WebElement displayed= driver.findElement(By.xpath("//strong"));
        Assert.assertTrue(displayed.equals("New order has been successfully added."));




    }
}



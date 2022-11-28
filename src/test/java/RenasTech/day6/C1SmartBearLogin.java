package RenasTech.day6;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.SmartBearLoginUtils;
import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C1SmartBearLogin {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @AfterMethod
    public void closing(){
        //we create thread.sleep() utility to achive code reausibility

        BrowserUtils.wait(2);
        //driver.close();

    }
    @Test
    public void Testcase1_LoginVerification(){
        //enter username-->Tester
        WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        //enter password--> test
        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        //click log in button
        WebElement login= driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

        //verify title equals="Web Orders"

        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders";

        Assert.assertEquals(actualTitle,expectedTitle);



    }
    @Test
    public void Testcase2_LoginVerification(){
        SmartBearLoginUtils.loginForSmartBear(driver);
        //title with verification with assert boolean true
        Assert.assertTrue(driver.getTitle().contains("Web Orders"),"verification is failed");
    }


}

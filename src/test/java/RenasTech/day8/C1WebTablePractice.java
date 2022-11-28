package RenasTech.day8;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.SmartBearLoginUtils;
import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C1WebTablePractice {
    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Test
    public void Testcase1_StreetVerification(){
        SmartBearLoginUtils.loginForSmartBear(driver);

        Assert.assertEquals(driver.getTitle(),"Web Orders");


    }
    @Test(dataProvider = "TestDataForStreetName")
    public void Testcase2_streetVerification(){
        SmartBearLoginUtils.loginForSmartBear(driver);
        SmartBearLoginUtils.verifyStreet(driver,"streetName");

    }
    @DataProvider(name = "TestDataForStreetName")
    public static Object[][] test(){
        return new Object[][]{
                {"17, Park Avenue"},
                {"44,Niblock"},
                {"hello world"},
                {"hey , ahmet"},


        };
    }
}

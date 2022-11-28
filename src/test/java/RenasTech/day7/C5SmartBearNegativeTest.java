package RenasTech.day7;

import RenasTech.Utilities.SmartBearLoginUtils;
import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class C5SmartBearNegativeTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Test(dataProvider = "testData")
    public void Testcase1_NegativeTest(String userID,String passwordID){
        SmartBearLoginUtils.negativeLogin(driver,userID,passwordID);

        WebElement errorMessage= driver.findElement(By.className("error"));

        Assert.assertTrue(errorMessage.isDisplayed());


    }
    @DataProvider(name = "testData")
    public static Object[][] wrongUserCredential(){
        return new Object[][]{

                {"zelal", "tets"},
                {"ogun", "mike"},
                {"ahmet", "turk"},
                {"mehmet", "test"},
                {"Tester", "test"}


        };
    }
}

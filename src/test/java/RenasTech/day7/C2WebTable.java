package RenasTech.day7;

import RenasTech.Utilities.SmartBearLoginUtils;
import RenasTech.Utilities.WebDriverUtility;
import RenasTech.day6.C1SmartBearLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C2WebTable {
    /**Task: Smartbear software street verification
     * open browser and login smartbear software
     * click on View all orders
     * verify Mark Smith has street as "9 Maple Valley
     *
     */
    public static WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver=WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //Login
        SmartBearLoginUtils.loginForSmartBear(driver);


    }
    @Test
    public void Testcase1_VerifyStreetName(){

        WebElement street= driver.findElement(By.xpath("//td[.='9, Maple Valley']"));

        System.out.println("Mark Smith has street name as: "+street.getText());

        String actualStreet= street.getText();
        String expectedStreet= "9, Maple Valley";

        Assert.assertEquals(actualStreet,expectedStreet,"street verification has failed");


    }

}

package RenasTech.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearLoginUtils {
    public static void loginForSmartBear(WebDriver driver) {
        //enter username-->Tester
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        //enter password--> test
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        //click log in button
        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

    }

    public static void negativeLogin(WebDriver driver, String userID, String passwordID) {
        //enter username-->Tester--->>>Invalid Usernmae
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys(userID);

        //enter password--> test--->>>Invalid password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys(passwordID);

        //click log in button
        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }

    public static void verifyStreet(WebDriver driver, String streetName) {
        //to locate all table //table[@id='ctl00_MainContent_orderGrid']
        //to locate 9 table rows //table[@id='ctl00_MainContent_orderGrid']//tr
        //to locate 4th table row //table[@id='ctl00_MainContent_orderGrid']//tr[4]
        // to locate all the strrets //table[@id='ctl00_MainContent_orderGrid']//tr//td[6]


        List<WebElement> streetlist = driver.findElements(By.xpath("table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));

        for(WebElement eachStreet: streetlist){

            if(eachStreet.getText().equals(streetName)){
                Assert.assertTrue(eachStreet.getText().equals(streetName));
                return;

            }
        }
        Assert.fail("Street name:" +streetName +"is not present");
    }
}

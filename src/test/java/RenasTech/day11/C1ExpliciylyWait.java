package RenasTech.day11;

import RenasTech.Utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;


public class C1ExpliciylyWait {
    WebDriverWait driverWait;

    @Test
    public void Testcase1(){

        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverUtil.getDriver().get("https://www.google.com");
        DriverUtil.getDriver().findElement(By.name("q"));


    }
    @Test
    public void Testcase2(){

       // WebDriverWait driverWait= new WebDriverWait(DriverUtil.getDriver(),10); gives error
    }
}

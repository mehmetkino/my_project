package RenasTech.day5;

import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class C3Dropdown {

     WebDriver driver;

    @BeforeClass
    public void setUp(){ System.out.println("Before Class is running"); }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class is running");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method is running");
        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
   @Test
    public void TC1_VerifyDefaultOptionInDropdown(){
        System.out.println("TC1 is running");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

        //We create and select object to work with select util here
        //if you see select tag name on html dom structure
        //means you can use select method

        WebElement dropDownBox= driver.findElement(By.id("dropdown"));
        Select dropdown= new Select(dropDownBox);

        String defaultOption= dropdown.getFirstSelectedOption().getText();

        String expectedDefault="Please select an option";

        System.out.println("default option is: "+defaultOption);
        Assert.assertEquals(defaultOption,expectedDefault,"Test case has failed");

    }
   @Test
    public void TC2_VerifyOptionFromDropDown() throws InterruptedException {
        System.out.println("Test case 2 is running");
        driver.findElement(By.xpath("//a[@href='dropdown']")).click();

      WebElement dropDownBox= driver.findElement(By.id("dropdown"));

      Select dropDown= new Select(dropDownBox);
      Thread.sleep(4000);

      //choose option 2
      dropDown.selectByVisibleText("Option 2");
      Thread.sleep(4000);

      //choose option 1
        //dropDown.selectByValue("1");

        //choose option 2 again
       // dropDown.deselectByIndex(2);
    }
    @AfterMethod
    public void closeing(){
        driver.close();
    }

}

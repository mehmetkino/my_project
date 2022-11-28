package RenasTech.day5;


import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class C4Revision {
    public static WebDriver driver;

    @BeforeClass
    public void beforeClass(){ System.out.println("Before class is running");}

    @AfterClass
    public void afterClass(){ System.out.println("After class is running"); }

    @BeforeMethod
    public static void setUp() throws InterruptedException {
        System.out.println("Before method is running");
        driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(4000);
    }

    @Test
    public static void Testcase1() throws InterruptedException {
         driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

         System.out.println("Testcase1 is succesfull");
         Thread.sleep(4000);

        WebElement ddownBox= driver.findElement(By.id("dropdown"));
        Select select= new Select(ddownBox);
        select.selectByValue("2");
        Thread.sleep(4000);
    }

    @Test(description = "this was ignore case")
    public void Testcase2(){
        System.out.println("just ignore this step"); }

    @Test
    public  void Testcase3(){
        System.out.println("Test case 3 is running");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

        WebElement element= driver.findElement(By.id("dropdown"));
        Select box= new Select(element);

        String actualWord= box.getFirstSelectedOption().getText();
        String expextedWord= "Please select an option";

        Assert.assertEquals(actualWord,expextedWord,"if it is false print out this messeage!");
    }

    @Test
    public void Testcase4(){
        System.out.println("Test case 4 is running");
    }


    @AfterMethod
    public void closeing(){
        System.out.println("After method is running");
        driver.close();
    }

}

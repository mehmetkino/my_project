package RenasTech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class    C5FirefoxNameLocator {
    public static WebDriver driver;

    //Note:code is not finished yet

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();

        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.google.com/");

        Thread.sleep(2000);

        //driver.navigate().forward();
        Thread.sleep(2000);
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("Orange");
        Thread.sleep(2000);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);

        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Banana");
        Thread.sleep(3000);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);

        String expectedTitle= "banana";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("The test case has passed!");
        }else{
            System.out.println("The test case has failed!");
        }
        System.out.println("The actual title is: "+driver.getTitle());



        driver.quit();





    }
}

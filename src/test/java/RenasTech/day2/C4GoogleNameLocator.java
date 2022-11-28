package RenasTech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4GoogleNameLocator {
    public static void main(String[] args) throws InterruptedException {

       //Open chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");


        //we found this element using name locator.
        WebElement searchBox=driver.findElement(By.name("q"));
       searchBox.sendKeys("Orange");
       Thread.sleep(2000);

       //4-click google search button
        driver.findElement(By.name("btnK")).click();

       // 5-Verify title:
      //Expected Title should start with "orange" word

      String expectedTitle="orange";
      String actualTitle= driver.getTitle();

      if(actualTitle.startsWith(expectedTitle)){

          System.out.println("Title verification has passed");

      }else{
          System.out.println("Title verification has failed");
      }
        System.out.println("Actual title is: "+driver.getTitle());

      //6-navigate back
        driver.navigate().back();
        Thread.sleep(2000);

      // 7- write banana in search box
      driver.findElement(By.name("q")).sendKeys("banana"+ Keys.ENTER);

      //8VERIFY TITLE CONTAINS banana
      String expectedTitle2= "banana";
      String actualTitle2=driver.getTitle();

      if (actualTitle2.contains(expectedTitle2)){

          System.out.println("Test case has passed");
      }else{

          System.out.println("Test case has failed");
      }
        System.out.println("actual title is: "+driver.getTitle());




        driver.close();






    }
}

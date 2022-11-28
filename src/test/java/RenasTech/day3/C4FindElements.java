package RenasTech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C4FindElements {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://www.apple.com");
        //click to iphone button
        //xpath has ability to go also from child to parent
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();

        /*
        4- print out the texts for all links
        count of links that doesnt have text
        //count of links that has text
        //a tag has the all the link
        //I am using a tag locator here.

         */

        List<WebElement> alllinks= driver.findElements(By.tagName("a"));

        for( WebElement eachlink: alllinks){

            String elementToText= eachlink.getText();
            System.out.println(elementToText);
        }


    }
}

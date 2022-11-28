package Practices.DAY1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2Code {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        //go to google
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);// wait 4 secs

        //Navigate back

        driver.navigate().back();
        Thread.sleep(2000);// wait 2 seconds

        driver.navigate().forward();
        Thread.sleep(2000);

        //navigate to amazon.com
        driver.navigate().to("https://www.amazon.com");

        //close tab
        //driver.close();

        //Verify title contains smile in amazon title

        String expectedTitleWord= "Smile";
        String actualTitle= driver.getTitle();

        if(expectedTitleWord.contains(expectedTitleWord)){
            System.out.println("Amazon title contains Smile and Title verification has passed");
        }
        else{
            System.out.println("Amazon title does not contains Smile and Title verification has failed");
        }
        System.out.println("Actual title is: "+driver.getTitle());

        Thread.sleep(5000);// wait 5 secs

        driver.close();
    }
}

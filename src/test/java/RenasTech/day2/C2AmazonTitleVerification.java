package RenasTech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2AmazonTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        /*
        Task
        ============
        1-open chrome browser
        2-go to google
        3- navigate back
        4-navigate forward
        5- navigate to amamzon.com page
        6-verify title contains :Smile

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().to("https://amazon.com");

        String containsTitle= "Smile";

        String actualTitle= driver.getTitle();

        if( actualTitle.contains(containsTitle)){

            System.out.println("The amazon title verification has passed");

        }else{
            System.out.println("The amazon title verification has failed! ");

        }
        System.out.println("The amazon title is: "+driver.getTitle());

        driver.close();




    }
}

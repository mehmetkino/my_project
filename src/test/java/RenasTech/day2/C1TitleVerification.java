package RenasTech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1TitleVerification {
    public static void main(String[] args) {
        /*
        Task
        --------
        1-Open chrome browser
        2-go to google.com
        3-Verify the title: Expected : Google
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        String expectedTitle="Google";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){

            System.out.println("Google title verification has passed. ");
        }else{

            System.out.println("Google title verification has failed.");

        }
        System.out.println("Browser actual title is: "+driver.getTitle());



    }
}

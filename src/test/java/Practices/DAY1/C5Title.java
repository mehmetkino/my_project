package Practices.DAY1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C5Title {

    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rediff.com");

        //we need to determine title of this page

        System.out.println("The title of rediff home page is : " +driver.getTitle());

        String title= driver.getTitle();

       if( title.equals("News | Rediffmail | Stock Quotes | Shopping")){
           System.out.println("Test case is passed");
       }
       else{
           System.out.println("Test case is failed");
       }

    }

    public static class day1Code {
        public static void main(String[]args) throws InterruptedException {

            System.out.println("Hello World");
          //setup chrome driver
            WebDriverManager.chromedriver().setup();

            //create driver object

            ChromeDriver driver= new ChromeDriver();

            //navigate to chrome browser

            driver.get("https://www.etsy.com/");

            //to close driver page
            driver.close();

            //wait time

          Thread.sleep(4000);



        }
    }
}

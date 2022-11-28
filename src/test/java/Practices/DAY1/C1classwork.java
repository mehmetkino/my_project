package Practices.DAY1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1classwork {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://skyscanner.com");

        String title= driver.getTitle();

        System.out.println("this is the title: "+title);


        String url= driver.getCurrentUrl();
        System.out.println("The url of skyscanner is : "+ url);

        if(title.equals("Skyscanner")|| url.equals(" https://www.skyscanner.com/sttc/px/captcha-v2/index.html?url=Lz8=&uuid=60a0299f-57cc-11ed-90b2-657264775862&vid=") ){
            System.out.println("Test case is passed");
        }
        else{
            System.out.println("Test case is failed");
        }

    }
}

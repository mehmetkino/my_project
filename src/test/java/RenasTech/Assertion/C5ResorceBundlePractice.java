package RenasTech.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class C5ResorceBundlePractice {
    public static WebDriver driver;

    @BeforeMethod
      public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

    }



    @Test
    public void Testcase1() throws IOException {

        Properties p= new Properties();

        String pathforfile= "configuration.properties";

        FileInputStream fileload= new FileInputStream(pathforfile);
        p.load(fileload);

        driver.get((p.getProperty("swagflag_url")));








    }

}

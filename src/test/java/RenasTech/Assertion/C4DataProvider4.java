package RenasTech.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C4DataProvider4 {

    WebDriver driver;

    @Test(dataProvider = "create")
    public void Testcase1(String username, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        driver.close();



    }

    @DataProvider(name = "create")
    public Object[][] swaglab() {

        return new Object[][]{
                {"username1", "1234b"},
                {"username2", "ahmet34"},
                {"username3", "ahmet3"},
                {"standard_user", "secret_sauce"}
        };
    }

}

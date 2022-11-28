package RenasTech.day9JavaScript;

import RenasTech.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class C3JavaScriptExamples extends TestBase {

    @Test
    public void Testcase1_handlingWindowWithJs(){
        driver.get("https://www.youtube.com");

        ((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com','_blank')");
        ((JavascriptExecutor)driver).executeScript("window.open('https://www.facebook.com','_blank')");

        Set<String> windows=driver.getWindowHandles();

        for(String window: windows){
            driver.switchTo().window(window);
            String currentwindow= driver.getWindowHandle();
            System.out.println("current window is: "+currentwindow);
            System.out.println("title: "+driver.getTitle());

        }



    }
    @Test
    public void scrollDownJs(){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        driver.get("https://demo.guru99.com/test/guru99home");
        js.executeScript("window.scrollBy(0,1000)");

    }


}

package RenasTech.day8;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class C2Tabs extends TestBase {
    //we use inheritance here
    //we use extend keyword in order to achive inheritance

    @Test
    public void Testcase1_TabHandle(){
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.id("WindowsII")).click();

        String currentWindow= driver.getWindowHandle();//this will store only one window

        System.out.println("current window: "+currentWindow);
        System.out.println("the current title is: "+driver.getTitle());

        WebElement clicksmeButton= driver.findElement(By.id("open-tab"));
        clicksmeButton.click();

        System.out.println("after clicking tab button title is: "+driver.getTitle());
        //in the above the title will be same bc you have not
        //switched to the new tab you are on the old tab

        Set<String> allwindows= driver.getWindowHandles();
        for( String tab: allwindows){
            driver.switchTo().window(tab);
            System.out.println(driver.getTitle());

        }



    }



}

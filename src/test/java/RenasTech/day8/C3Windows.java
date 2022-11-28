package RenasTech.day8;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class C3Windows extends TestBase {

    @Test
    public void Testcase1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.id("WindowsII")).click();

        System.out.println("Before clicking new window:"+ driver.getTitle());

        WebElement opennewWindow= driver.findElement(By.id("open-window"));
        opennewWindow.click();

        Set<String> allwindows=driver.getWindowHandles();

        List<String> windowList= new ArrayList<>();
        for( String NewWindow: allwindows){

            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
            System.out.println("after switching get title:" +driver.getTitle());

        }
        driver.switchTo().window(windowList.get(1));
        System.out.println("after switching get title: "+driver.getTitle());

        //click on contact link on the second window
        driver.findElement(By.xpath("(//span[.='Contact' and@class='elementor-icon-list-text'])[1]")).click();


    }
}

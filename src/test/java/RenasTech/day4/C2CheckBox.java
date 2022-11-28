package RenasTech.day4;

import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class C2CheckBox {
    public static void main(String[] args) {
        /*
        open chrome browser
        go to guru99.com
        verify checkbox1 is not slected
        verify checkbox2 is selected

         */
        //1- open chrome browser

        WebDriver driver= WebDriverUtility.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

       //2- GO TO guru99.com
       driver.get("https://demo.guru99.com/test/radio.html");
       //3- verify check box is not seleceted

        WebElement checkbox1 =driver.findElement(By.id("vfb-6-0"));
        if(!checkbox1.isSelected()){
            System.out.println("checkbox verification has passed");
        }else {
            System.out.println("checkbox1 is selected therefore it is failed");
        }
        WebElement checkbox2= driver.findElement(By.id("vfb-6-1"));
        if(checkbox2.isSelected()){
            System.out.println("Checkbox2 verification has passed");

        }else{
            System.out.println("Checkbox2 is not selected");
        }

        driver.quit();








    }
}

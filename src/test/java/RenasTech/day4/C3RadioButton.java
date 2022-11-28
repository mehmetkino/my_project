package RenasTech.day4;

import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class C3RadioButton {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to courses.letscodeit.com
        //click on Bmwradio button
        //verirfy that it is selcected

        WebDriver driver= WebDriverUtility.getDriver("Chrome");
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //click on bmw radio button

        WebElement bmwRadioSelected= driver.findElement(By.id("bmwradio"));

        bmwRadioSelected.click();

        boolean bmwradioselected= bmwRadioSelected.isSelected();
        if(bmwRadioSelected.isSelected()){
            System.out.println("Bmw is sleceted");

        }else{
            System.out.println("Bmw is not selected,verification has failed");
        }


        //verify that Honda is not selected
      WebElement HondaButton= driver.findElement(By.id("hondaradio"));

        if(!HondaButton.isSelected()){
            System.out.println("Honda test case has passed");
        }else{
            System.out.println("Test case is selected that is why it is not passed");
        }
        Thread.sleep(3000);

    }




}

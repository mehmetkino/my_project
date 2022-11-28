package RenasTech.day10_Actions;

import RenasTech.Utilities.BrowserUtils;
import RenasTech.Utilities.DriverUtil;
import RenasTech.base.TestBase2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C3ActionsExample extends TestBase2 {
    /*Actions class is a predefined class in Selenium web driver
    used to perform multiple keyboard and mouse operations
    such as Right Click, Drag and Drop, etc.

1-Initially, we need to instantiate an object of Actions class by passing the driver instance as a parameter
2-Using find element command, we need to find the locator of an element that we want to double click
3-Using the pre-defined double click method of Actions class, we need to perform double click operation
on the web element

// Actions actions= new Actions(driver)

     */


  Actions actions;
    @ Test
    public void Testcase1(){
        //to double click in selenium we use actions class.
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        //to double click we use actions class. we create an object and we use its reference to call it.

       WebElement doubleClickButton= DriverUtil.getDriver().findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        actions = new Actions(DriverUtil.getDriver());
       actions.doubleClick(doubleClickButton).perform();

       //Now handle to alert that pops up.

        Alert alert= DriverUtil.getDriver().switchTo().alert();
        //wait couple of secs
        BrowserUtils.wait(2);
        //alert.dismiss(); //i can dismiss the alert

        alert.accept();




    }
    @Test
    public void Testcase2_RightClick(){

        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        // right click
        WebElement rightclick= DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));

        actions= new Actions(DriverUtil.getDriver());
        actions.contextClick(rightclick).perform();

        //click on edit button
        DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();

        //accept alert
        Alert alert= DriverUtil.getDriver().switchTo().alert();

        alert.accept();

    }
    @Test
    public void Testcase3_dragAnddrop(){
        // Drag and drop is predefined method in Actions class we will use it
        //your task is drag bank element and drop it in the box
        //first= find drag element location
        //second== find drop element location

        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");

        WebElement dragFrom= DriverUtil.getDriver().findElement(By.id("credit2"));
        WebElement dragTo= DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']//li"));

        actions= new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom,dragTo).perform();

        /*task:
        drag 5000 to the amount section and drop it
         */

        WebElement drag5000= DriverUtil.getDriver().findElement(By.xpath("//li[@id='fourth']"));
        WebElement drop5000= DriverUtil.getDriver().findElement(By.id("amt7"));

        actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(drag5000,drop5000).perform();

    }

}

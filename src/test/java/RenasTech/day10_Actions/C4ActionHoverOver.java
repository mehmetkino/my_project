package RenasTech.day10_Actions;

import RenasTech.Utilities.DriverUtil;
import RenasTech.base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C4ActionHoverOver extends TestBase2 {
    /*
    Task:
    1-go to https://the-internet.herokuapp.com/hovers
    2-move mouse to a third image
    3-verify text of image present on the screeen

     */

    @Test
    public void Testcase1(){
        DriverUtil.getDriver().get("https://the-internet.herokuapp.com/hovers");

        WebElement thirdimg=DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));
        Actions act= new Actions(DriverUtil.getDriver());

        act.moveToElement(thirdimg).perform();
        WebElement textofImg=DriverUtil.getDriver().findElement(By.xpath(" //h5[.='name: user3']"));

        boolean textDisplayed= textofImg.isDisplayed();

        Assert.assertTrue(textDisplayed,"if it is false,show me it is not displayed");


    }

}

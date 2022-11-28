package RenasTech.day9JavaScript;

import RenasTech.Utilities.PropertiesReadingUtil;
import RenasTech.Utilities.SmartBearLoginUtils;
import RenasTech.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.List;

public class C2SmartBearPractice extends TestBase {

    /**
     * open chrome browser
     * go to smartbear website
     * clcik on box which belongs "charles Dodgeson"
     * clcick on the delete button
     * verify charles deleted from the list
     *
     */
    @Test
    public void Testcase1_DeleteVerification(){
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearLoginUtils.loginForSmartBear(driver);

        //click charles dodgeson check box
        WebElement charlesCheckBox= driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        charlesCheckBox.click();

        //click delete button
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

        //verify charles is deleted from the list
        List<WebElement> listOfNames= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement eachNames: listOfNames){
            Assert.assertFalse(eachNames.getText().equals("Charles Dodgeson"));
        }



    }






}

package RenasTech.Pages;

import RenasTech.Utilities.DriverUtil;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public  abstract class BasePage {

   // protected WebDriverWait webDriverWait= new WebDriverWait(DriverUtil.getDriver(),15);


    public BasePage() {
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
}

package RenasTech.Pages;

import RenasTech.Utilities.DriverUtil;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLogin_page extends BasePage {

     @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loggingButton;

    public void LogingPage(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loggingButton.click();
    }






}

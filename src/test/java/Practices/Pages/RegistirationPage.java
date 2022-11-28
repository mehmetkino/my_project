package Practices.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistirationPage extends BasePage{
    WebDriver driver;


    @FindBy(id="id=user_email_login") public WebElement Email;

    @FindBy(id = "user_password") public WebElement Password;

    @FindBy(id="user_submit") public WebElement Singin_Button;


   public void Registiration(String email, String password){

        Email.sendKeys(email);
        Password.sendKeys(password);
        Singin_Button.click();




    }

}

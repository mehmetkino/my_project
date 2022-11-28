package Practices.Pages;

import RenasTech.Utilities.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebDriver driver= new ChromeDriver();



    public BasePage(){

        PageFactory.initElements(driver,this);
    }


}

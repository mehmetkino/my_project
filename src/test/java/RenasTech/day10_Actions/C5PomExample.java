package RenasTech.day10_Actions;

import RenasTech.Pages.SmartBearLogin_page;
import RenasTech.Utilities.DriverUtil;
import RenasTech.Utilities.PropertiesReadingUtil;
import RenasTech.base.TestBase2;
import org.testng.annotations.Test;

public class C5PomExample extends TestBase2 {

    //create instance of the pom class for login
    SmartBearLogin_page smartBearLogin_page;

    @Test
    public void Testcase1(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));


        smartBearLogin_page= new SmartBearLogin_page();
        smartBearLogin_page.LogingPage("Tester", "test");



    }

}

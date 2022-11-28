package Practices.DAY2;

import Practices.DAY1.DriverUtility1;
import Practices.DriverUtility1.Driver;
import Practices.Pages.RegistirationPage;
import org.testng.annotations.Test;

public class C1SignInLoginPage extends Driver {

    RegistirationPage registirationPage;

    @Test
    public void Testcase1(){

        registirationPage= new RegistirationPage();
       registirationPage.Registiration("mehmtkino@yahoo.com", "4747");


    }
}

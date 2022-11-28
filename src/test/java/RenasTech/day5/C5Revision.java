package RenasTech.day5;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C5Revision {
    @BeforeTest
    public void loginApplication(){  System.out.println("Login is succesfull"); }

    @Test(priority=1)
    public void Test3(){
        System.out.println("Test3");
    }

    @Test(priority = 3)
    public void Test2(){
        System.out.println("Test2");
    }
    @Test(priority = 2)
    public void Test1(){
        System.out.println("Test1");
    }
    @AfterTest
    public void logOut(){
        System.out.println("Logout is succesfull");

    }

}

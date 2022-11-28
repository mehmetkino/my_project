package RenasTech.Assertion;

import org.testng.annotations.Test;

public class C3Groups {

    @Test(priority = 4,groups = "regresssion")
    public void Test1(){
        System.out.println("Test1");
    }
    @Test(groups = "regression")
    public void Test2(){
        System.out.println("Test2");
    }
    @Test(groups = {"regression","smoke"})
    public void Test3(){
        System.out.println("Test3");
    }
    @Test(groups = {"regression", "smoke"})
    public void Test4(){
        System.out.println("Test4");
    }
}

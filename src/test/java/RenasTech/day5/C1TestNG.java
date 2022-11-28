package RenasTech.day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class C1TestNG {
    @BeforeClass
    public void setupClass() {
        System.out.println("Before class is running");
    }

    @AfterClass
    public void setupAfterClass() {
        System.out.println("After class is running");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("Before Method is running");
    }

    @AfterMethod
    public void closing() {
        System.out.println("After method is running");
    }
    //dependsOnMethod will be depend on Test3
    //if
    @Test(priority = 3,dependsOnMethods = "Test3")
    public void Test1(){
        System.out.println("Test case 1 is running");
    }
    @Test(priority = 1)
    public void Test3(){
        System.out.println("Test case 3 is running");
        String actualWord="Bmw";
        String expectedWord="Honda";
        Assert.assertEquals(actualWord,expectedWord);
        System.out.println("Contuinue Test3");
        //both words are not equals so systemout will not execute.
    }
    @Test(priority = 2)
    public void Test2(){
        System.out.println("Test 2 is running");
        String str1="USA";
        String str2="USA";
        Assert.assertEquals(str1,str2);

    }
    //@Ignore simply ignores the test case skips curser skips to the next block
    @Ignore
    @Test
    public void Test4(){
        System.out.println("Test case 4 is running");

    }

}

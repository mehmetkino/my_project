package RenasTech.day4;

import org.testng.Assert;
import org.testng.annotations.*;

public class C6TestNGAssertion {
    // Before class runs only one time
    //before method runs every  before each test case.

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
    @Test(priority = 3)
    public void Tc1_Test(){
        System.out.println("Test case 1 is running");
    }
    @Test
    public void Tc3_Test(){
        System.out.println("Test case 3 is running");
        //ASSERTION is verifiying a condition
        String actualWord = "New York";
        String expectedWord = "Ohio";

        Assert.assertEquals(actualWord,expectedWord);
    }
    @Test
    public void TC2_Test() {
        System.out.println("Test case 2 is running");

        //Assertion mean a testng utility class, and this class
        //methods inbuilt classses like asserEquals,assertFalse etc

        String name1= "Aex";
        String name2= "Alex";
        Assert.assertEquals(name1,name2);
//any next line block of code will not be executed, after assertion if it fails.
        //but next block is will execute
    }

}

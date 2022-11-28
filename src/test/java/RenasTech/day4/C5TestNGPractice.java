package RenasTech.day4;

import org.testng.annotations.*;

public class C5TestNGPractice {
    @BeforeClass
    public void setupClass(){
        System.out.println("Before class is running");

    }
    @AfterClass
    public void setupAfterClass(){
        System.out.println("After class is running");

    }
    @BeforeMethod
        public void setup(){
            System.out.println("Before Method is running");
        }

    @AfterMethod
    public void closing(){
        System.out.println("After method is running");
    }
    @Test
    public void TestCase1(){
        System.out.println("Test case 1 is running");
    }
    @Test
    public void TestCase2(){
        System.out.println("Test case 2 is running");
    }
    @Test
    public void TestCase3(){
        System.out.println("Test case 3 is running");
    }

}

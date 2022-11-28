package RenasTech.day4;


import org.testng.annotations.*;

public class C4TestNG {
    @BeforeMethod

    public void setup(){ System.out.println("Before Method is running");}

    @AfterMethod

    public void closing(){ System.out.println("After Method is running"); }

    @Test
    public void TestCase_1(){System.out.println("Test case 1 is running"); }
    @Test
    public void TestCae_2(){  System.out.println("Test case 2 is running");}

    @Test
    public void TestCase_3(){System.out.println("Test case 3 is running"); }


}

package RenasTech.day9JavaScript;

import RenasTech.Utilities.DriverUtil;
import RenasTech.Utilities.PropertiesReadingUtil;
import RenasTech.base.TestBase2;
import org.testng.annotations.Test;

public class C4DriverUtilPractice extends TestBase2 {
    //go to google
    //seaarch for title
    //verify title contains hello

   @Test
   public void testcase1_practise(){
       DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));

   }


}

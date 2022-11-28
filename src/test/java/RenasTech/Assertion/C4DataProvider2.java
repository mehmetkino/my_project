package RenasTech.Assertion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C4DataProvider2 {
    //dataProvider examples

    @Test(dataProvider = "carTest")
    public void Testcase1(String car, String name){
        System.out.println(car+"======="+name);
    }

    @DataProvider
    public Object[][] carTest(){

        Object [][] carTest= new Object[3][2];

        //first row
        carTest[0][0]="car1";
        carTest[0][1]="bmw";

        //second row
        carTest[1][0]="car2";
        carTest[1][1]="audi";

        //third row
        carTest[2][0]="car3";
        carTest[2][1]="mercedes";

        return carTest;

    }

}

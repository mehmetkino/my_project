package RenasTech.Assertion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C4DataProvider1 {
    /**DataProvider
     * DataProvider in TestNG allows us to pass multiple parameters to a single test in a single exucution
     * using DataProvider we can easily pass multiple values to a test in a just one execution cycle.
     * i will show you 2 ways of creating dataProvider here
     */

    @Test(dataProvider ="dataTest")
    public void Test(String username, String password){

        System.out.println(username +"======="+password);
    }

    @DataProvider
    public Object[][] dataTest(){

        Object[][] datatest= new Object[4][2];

        //first row
        datatest[0][0]="user1";
        datatest[0][1]="password1";

        //second row
        datatest[1][0]="user2";
        datatest[1][1]="user2";

        ///third row
        datatest[2][0]="user3";
        datatest[2][1]="pass3";

        //forth row
        datatest[3][0]="pass4";
        datatest[3][1]="pass4";

        return  datatest;


    }

}

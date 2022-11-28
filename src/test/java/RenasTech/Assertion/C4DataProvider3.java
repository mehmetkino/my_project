package RenasTech.Assertion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C4DataProvider3 {
    // first way of creating two dimensional array includes too much hardcoding and
    //any case of small mistake will thrrow an exception
    //or if you want add new parameters you cannot etc
    //lets go with second way
    //in the paranthesis in the test you want to execute:
    // 1-you can throw dataProvider ="name" from @DataProvider
    //or name of the method
    @Test(dataProvider = "test1")
    public void Testcase1(String x,String y){
        System.out.println(x+"=============="+y);
    }

    @DataProvider(name = "test1")
    public Object[][] TestCar(){

        return new Object[][]{
                {"username", "password"},
                {"username1","password1"},
                {"username2","password2"},
                {"username3","password3"},

        };
    }
}

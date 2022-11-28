package Practices.DAY1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class C6SkippingTestCases {

    boolean database= false;

    @Test(enabled = false)//first way
    public void Testcase1(){
        System.out.println("Skipping this test case because it is not complete");

    }
    @Test// second way
    public void Testcase2(){
        System.out.println("Skipping testcase 2 forcefully");
       // throw new SkipException("Skipping this test");
    }
    @Test //skipping testcase conditionally create a boolean variable then if condition
    public void Testcase3(){

        if(database==false){
            System.out.println("execute the testcase3 if database is true !");
        }else{
            System.out.println("do not execute!");
            throw new SkipException("DO NOT EXECUTE");
        }


    }

}

package RenasTech.day9JavaScript;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class C1PropertiesPractice {
    @Test
    public void Testcase1_SytemProperties(){
        //java has some inbuilt/readymade properties that
        //we can use system info

        System.out.println(System.getProperty("os.name")); //MAC OS X


    }
    @Test
    public void Testcase2_configirationProperties() throws FileNotFoundException {
        //to be able to make our code to understand properties file
        //i need to create an object that way i connect to my file

        Properties properties= new Properties();

        String pathforPropertiesFile="configuration.properties";
        //then create a string to store your properties file path

        //we need to tell our compiler to open the file
        FileInputStream fileInputStream= new FileInputStream(pathforPropertiesFile);

        //in case if there is an exception when running
        //we will create try and catch method

        try{
            properties.load(fileInputStream);
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("UserName"));
        System.out.println(properties.getProperty("Password"));







    }
}

package RenasTech.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {


    private static Properties properties= new Properties();
    //incapsulation for hiding data

    static {
        //static block will get execute before everything
        //get the path and store it in a String
        String pathForPropertiesFile="configuration.properties";

        try{
            FileInputStream fileInputStream= new FileInputStream(pathForPropertiesFile);
            properties.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static String getProperties(String keyword){
        return properties.getProperty(keyword);

    }
}

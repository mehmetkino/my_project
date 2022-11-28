package RenasTech.Utilities;

public class BrowserUtils {
    /*
    create an utility method called wait
    it should be static method so we can call it by its class nmae
    return type is void we dont watn anything in return
    parameter should be (int second)
     what is the purpose of that method:
     to handle thread.sleep() with try and catch multiple with second parameter



     */

    public static void wait(int second){
        try{
            Thread.sleep(1000*second);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

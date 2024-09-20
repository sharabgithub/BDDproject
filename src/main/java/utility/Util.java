package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileInputStream;
import java.util.Properties;

import static base.Base.webDriver;

public class Util {
    static Properties prop;
    static FileInputStream fis;


    public static String readProperties(String key){
       String file = System.getProperty("user.dir")+"/src/main/resources/config.properties";
        prop = new Properties();
        try{
            fis = new FileInputStream(file);
            prop.load(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

    public static byte[] takeScreenShot()    {
        return ((TakesScreenshot) webDriver.get()).getScreenshotAs(OutputType.BYTES);
    }

}

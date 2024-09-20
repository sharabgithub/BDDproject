package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Util;

import java.time.Duration;

public class Base {
    public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    public static WebDriver driver;

    public static void launchDriver(){

        if(Util.readProperties("browser").equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

            webDriver.set(driver);
        }

    }

    public synchronized WebDriver getDriver(){
        return webDriver.get();
    }
    public static void closeDriver(){
        webDriver.get().close();
        webDriver.get().quit();
    }


}

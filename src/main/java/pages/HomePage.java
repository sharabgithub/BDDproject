package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;

public class HomePage {

    @FindBy(xpath = "//strong[text()= 'Congratulations student. You successfully logged in!']")
    private WebElement loginMsg;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void verifyLogin(){
        assertTrue(loginMsg.isDisplayed(), "Login is Successfull !!!!!");
    }
}

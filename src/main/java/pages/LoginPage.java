package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;

public class LoginPage {
    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(xpath = "//div[@id='error'][text()='Your password is invalid!']")
    private WebElement invalidPwdMsg;

    @FindBy(xpath = "//div[@id='error'][text()='Your username is invalid!']")
    private WebElement invalidUnMsg;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void login(String UN, String PWD){
        username.sendKeys(UN);
        password.sendKeys(PWD);
        submit.click();
    }

    public void loginFailed(String wrongCred){
        if(wrongCred.equals("password")){
            assertTrue(invalidPwdMsg.isDisplayed(), "Invalid PWD msg displayed");
        }else if(wrongCred.equals("username")){
            assertTrue(invalidUnMsg.isDisplayed(), "Invalid UN msg displayed");
        }
    }

}

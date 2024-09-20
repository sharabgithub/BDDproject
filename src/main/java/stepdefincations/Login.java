package stepdefincations;

import base.Base;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utility.Util;

import java.time.Duration;

public class Login {
    public static WebDriver dr;
    LoginPage objLogin;
    HomePage objHomepage;

    public Login(){
        dr  = Base.webDriver.get();
        objLogin = new LoginPage(dr);
        objHomepage = new HomePage(dr);
    }


    @Given("user navigates to the website {string}")
    public void user_launch_website(String site) {
        String website = "https://"+ Util.readProperties(site);
        dr.get(website);
    }
    @Given("there user logs in through Login Window by using Username as {string} and Password as {string}")
    public void login_by_using_username_as_and_password_as(String UN, String PWD) {
        objLogin.login(UN, PWD);
    }
    @Then("login must be successful.")
    public void login_must_be_successful() {
        objHomepage.verifyLogin();
    }

    @Then("login must be failed with wrong {string}.")
    public void login_must_be_failed(String wrongCred) {
        objLogin.loginFailed(wrongCred);
    }
}

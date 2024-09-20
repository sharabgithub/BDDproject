package stepdefincations;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base {

    @Before
    public void beforeScenario(Scenario scenario){
        launchDriver();
    }

    @After
    public void afterScenario(Scenario scenario){
        closeDriver();
    }


}

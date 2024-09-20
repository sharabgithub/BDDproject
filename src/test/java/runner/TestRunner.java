package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;


@CucumberOptions(
            features="src/test/resources/features",
            glue={"stepdefincations"},
            //dryRun=false,//Feature file compile and it is true then stepdef class is executed
            // tags = "@Single and not @Multiple ",// specific test case @tags name are use here
            monochrome=true,
            publish = true
//            plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

    )

//implementation of cucumber and testng
    public class TestRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider
        public Object[][] scenarios(){
            return super.scenarios();
        }
    }

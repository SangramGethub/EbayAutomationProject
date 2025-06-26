package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		 features = "src/test/java/feature",
	    glue = {"stepDefinition","feature"},
		plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		 }
	)
public class TestRunner extends AbstractTestNGCucumberTests{

	
}

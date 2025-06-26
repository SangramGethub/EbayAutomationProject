package feature;

import BrowserSetup.BaseClass;
import PropertyBase.PropertyConfig;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import keyword.Keywords;
import io.qameta.allure.Allure;

public class Hooks {

	@BeforeAll
	public static void openBrowser() {
		
	BaseClass.launchBrowser(PropertyConfig.getProperty("browserName"));
	Allure.step("Browser launched: ");
	
	Keywords.navigateTo("url");
	Allure.step("Navigated to URL: ");
	}
	
	@AfterAll
	public static void closeBrowser() {
		BaseClass.tearDown();
		Allure.step("Browser closed");
	}
	
}

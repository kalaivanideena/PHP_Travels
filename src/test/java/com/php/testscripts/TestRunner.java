package com.php.testscripts;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.php.baseclass.BaseClass;
import com.php.helpers.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", 
		"html:Reports", 
		"junit:Reports/cucumber.xml",
		"json:Reports/cucumber.json" },
		features = "src\\test\\java\\com\\php\\feature",
		glue = "com.php.stepdefinition",
		tags = {"@TC2"},
		strict = false
		)

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Exception	{
		driver = BaseClass.browser_LaunchIgnoreCase(FileReaderManager.getInstance().getConfigReader().getBrowserName());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		
		Reporter.loadXMLConfig(
				new File("C:\\Users\\HP\\eclipse-workspace\\PHP_Travels\\src\\test\\java\\com\\php\\resources\\extent-config.xml"));

		//driver.quit();
	}
}

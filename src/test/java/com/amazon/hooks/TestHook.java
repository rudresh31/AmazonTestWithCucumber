package com.amazon.hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.driverfactory.DriverSetup;
import com.amazon.utilities.BaseClass;
import com.amazon.utilities.ReadProperties;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestHook extends BaseClass{
	
	@Before(order = 0,value = "skip_scenario")
	public void Skip_scenarios(Scenario sc) {
		System.out.println("Skipped Scenarios Are: "+sc.getName());
	}
	@Before(order = 1)
	public static void Initalized() {
		prop=ReadProperties.getprop();
		System.out.println(prop.getProperty("browser"));
		driver = DriverSetup.InitalizedDriver(prop.getProperty("browser"));
		driver.get(prop.getProperty("baseUrl"));
	}
	
	@After(order = 0)
	public static void end() {
		DriverSetup.getDriver().close();
	}
	
	
	//@BeforeStep
	@AfterStep
	public static void addFailScenariosScreenshot(Scenario scenario) throws IOException {
		  if(scenario.isFailed()) {
		  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		  scenario.attach(fileContent, "image/png", "screenshot");
		  }
	}


}

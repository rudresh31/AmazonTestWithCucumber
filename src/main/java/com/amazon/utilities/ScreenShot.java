package com.amazon.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.gherkin.model.Scenario;


public class ScreenShot extends BaseClass {
	
	
	// this method take screen shot of complete page
	public static void takeScreenShot(Scenario s,String filename) {
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver; // type cast driver instance into TakeScreenShot
		File srcFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		String filepath = System.getProperty("user.dir")+"\\programOutput\\"+filename+".png";
		File destFile = new File(filepath);
		try {
			//save the screenshot to the "screenshot" folder
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
}

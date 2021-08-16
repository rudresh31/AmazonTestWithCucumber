package com.amazon.pages;

import java.util.Properties;

import org.openqa.selenium.By;

import com.amazon.utilities.BaseClass;
import com.amazon.utilities.ReadProperties;

public class loginPage extends BaseClass {
	
	static Properties prop1 = ReadProperties.getprop1();
	static By emailField = By.xpath(prop1.getProperty("emailfield"));
	static By continueBtn = By.xpath(prop1.getProperty("continuebtn"));
	static By passwordField = By.xpath(prop1.getProperty("passwordfield"));
	static By SignIn = By.xpath(prop1.getProperty("sign-in"));
	static By errorMsg = By.xpath(prop1.getProperty("errormsg"));
	static String errorMessage;
	
	public static void EnterValueEmailField(String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	
	public static void ClickOnContinueBtn() {
		driver.findElement(continueBtn).click();
	}
	
	public static void EnterValuePasswordField(String pass) {
		driver.findElement(passwordField).sendKeys(pass);
	}
	
	public static void ClickOnSign_InBtn() {
		driver.findElement(SignIn).click();
	}
	
	public static String getMessage() {
		errorMessage = driver.findElement(errorMsg).getText();
		return errorMessage;
	}
	
	
}

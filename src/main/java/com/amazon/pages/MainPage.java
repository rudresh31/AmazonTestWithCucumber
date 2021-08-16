package com.amazon.pages;

import java.util.Properties;

import org.openqa.selenium.By;

import com.amazon.utilities.BaseClass;
import com.amazon.utilities.ReadProperties;

public class MainPage extends BaseClass {
	
	static Properties prop1 = ReadProperties.getprop1();
	static By signInBtn = By.xpath(prop1.getProperty("signinbtn"));
	static By searchField = By.xpath(prop1.getProperty("searchfield"));
	static By searchBtn = By.xpath(prop1.getProperty("searchbtn"));
	static By cart = By.xpath(prop1.getProperty("cart"));
	
	public static void ClickSignInBtn() {
		driver.findElement(signInBtn).click();
	}
	
	public static void EnterValueSearchField(String data) {
		driver.findElement(searchField).sendKeys(data);
	}
	
	public static void ClickSearchBtn() {
		driver.findElement(searchBtn).click();
	}
	
	public static void ClickCart() {
		driver.findElement(cart).click();
	}
	

}

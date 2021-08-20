package com.amazon.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.amazon.utilities.BaseClass;
import com.amazon.utilities.ReadProperties;

public class MainPage extends BaseClass {
	
	static Properties prop1 = ReadProperties.getprop1();
	static By signInBtn = By.xpath(prop1.getProperty("signinbtn"));
	static By searchField = By.xpath(prop1.getProperty("searchfield"));
	static By searchBtn = By.xpath(prop1.getProperty("searchbtn"));
	static By cart = By.xpath(prop1.getProperty("cart"));
	static By searchData = By.xpath("//div[@id='suggestions-template']/div/div//span[2]");
	
	public static void ClickSignInBtn() {
		driver.findElement(signInBtn).click();
	}
	
	public static void EnterValueSearchField(String data) {
		driver.findElement(searchField).sendKeys(data);
	}
	
	public static List<WebElement> getDataList(){
		
		List<WebElement> elements = driver.findElements(searchData);
		
		return elements;
	}
	
	public static void ClickSearchBtn() {
		driver.findElement(searchBtn).click();
	}
	
	public static void ClickCart() {
		driver.findElement(cart).click();
	}
	

}

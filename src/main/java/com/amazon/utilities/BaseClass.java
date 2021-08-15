package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {

	// public static RemoteWebDriver driver;
	public static WebDriver driver;
	public static WebElement element;
	public static FileInputStream fin;
	public static FileOutputStream fout;
	public static Properties prop;
	public static String driverPath = System.getProperty("user.dir");


}

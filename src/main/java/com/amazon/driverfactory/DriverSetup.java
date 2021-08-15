package com.amazon.driverfactory;


import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.amazon.utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverSetup extends BaseClass {
	
	
	public static ThreadLocal<WebDriver> threaddrive = new ThreadLocal<>(); 
	
	public static WebDriver InitalizedDriver(String st) {
		
		if(st.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", driverPath+"\\driver\\chromedriver.exe");
			//DesiredCapabilities dc = new DesiredCapabilities().chrome();
			//driver = new RemoteWebDriver(new URL("http://192.168.42.253:4444/wd/hub"), dc);
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			threaddrive.set(new ChromeDriver());
		}else if(st.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", driverPath+"\\driver\\geckodriver.exe");
			//DesiredCapabilities dc = new DesiredCapabilities().firefox();
			//driver = new RemoteWebDriver(new URL("http://192.168.42.253:4444/wd/hub"), dc);
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option1 = new FirefoxOptions();
			option1.setCapability("--disable-notifications", true);
			threaddrive.set(new FirefoxDriver(option1));
		}else {
			System.out.println("enter currect Browser value");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		return getDriver();
		
	}
	
	public static synchronized WebDriver getDriver() {
		return threaddrive.get();	
	}
	

}
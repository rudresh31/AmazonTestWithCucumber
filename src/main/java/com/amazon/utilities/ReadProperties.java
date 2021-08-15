package com.amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties extends BaseClass {
	
	
	public static Properties getprop() {
		try {
			fin = new FileInputStream(driverPath+"\\src\\test\\resources\\com\\properties\\config.properties");
			prop = new Properties();
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	public static Properties getprop1() {
		try {
			fin = new FileInputStream(driverPath+"\\src\\test\\resources\\com\\properties\\xpath.properties");
			prop = new Properties();
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
}

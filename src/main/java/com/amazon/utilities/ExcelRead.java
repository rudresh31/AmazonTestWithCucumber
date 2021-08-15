package com.amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead extends BaseClass{
	
	public static Object[][] data = new Object[1][3];
	
	
	
	public static Object[][] raedDataFromExcel(int k,int l) throws IOException{
		
		FileInputStream fin = new FileInputStream(new File(System.getProperty("user.dir")+"\\Resources\\logindetails.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet = wb.getSheet("LoginDetails");
		for(int j =k;j<1;j++) {
			Row row = sheet.getRow(j);
			for(int i=l;i<3;i++) {
				data[j][i] = String.valueOf(row.getCell(i));
				//System.out.println(data[j][i].toString());
			}
		}
		wb.close();
		return data;
	}
	
	public static int getRowNum(String Str) throws IOException {
		
		fin = new FileInputStream(new File(System.getProperty("user.dir")+"\\Resources\\"));
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheet("");
		int n = 100,m=0;
		for(int i =0;i<n;i++) {
			Row row = ws.getRow(i);
			String s = String.valueOf(row.getCell(0));
			if(s.equalsIgnoreCase(Str))
				m = i;
		}
		
		return m;	
	}
	
	

}

package com.amazon.utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void excelWrite(List<String> l,String sheetname,String excelfileName) {
		
		//Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
				
		//Create Excel Sheet
		XSSFSheet samplesheet = workbook.createSheet(sheetname);
		
		int rownum=0;
		
		for(String s : l) {
			Row row = samplesheet.createRow(rownum++); // creating row object
			String[] data = s.split(","); // splitting string 
			
			int cellNum=0;
			for(String str : data) {
				Cell cell = row.createCell(cellNum++); //  creating cell object 
				cell.setCellValue(str); // set value in the cell
			}
		}
		
		try {
			FileOutputStream writeFile = new FileOutputStream(System.getProperty("user.dir")+"\\programOutput\\"+excelfileName+".xlsx");
			
			workbook.write(writeFile);
			
			writeFile.close();
			System.out.println("Sample Excel file is being created Successfully");
			workbook.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook wb;
	
	public ExcelDataProvider() throws IOException {
		String path="C:\\Users\\SAI\\eclipse-workspace\\Batch_10B_Framework\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
		
	}

	public String getStringData(String SheetName, int row, int cell) {
		return wb.getSheet(SheetName).getRow(0).getCell(0).getStringCellValue();
		
	}
	
	

}

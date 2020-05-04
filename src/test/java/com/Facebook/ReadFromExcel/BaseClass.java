package com.Facebook.ReadFromExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	static String id ="";
	static String pwd="";
	
	@Test
	public static void ReadFromExcel() throws Exception
	{
	File src= new File("E:\\Wokspace\\TestFb.xlsx");
	FileInputStream fis= new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	id=sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data from excel : " +id);
	

	pwd=sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("Data from excel : " +pwd);
	
	wb.close();
	}

}

package com.flipkart.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String readPropData(String propPath,String key ) throws Throwable {
		FileInputStream fis = new FileInputStream(propPath);
	
		Properties prop = new Properties();
		prop.load(fis);
	String propValue = prop.getProperty(key,"Incorrect key");
	return propValue;
	}
	
	public String getData(String path,String sheetName,int row,int cell) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		   String val = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return val;
		}
	
	public int getRowCount(String path,String sheet) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
          int	rc	=wb.getSheet(sheet).getLastRowNum();
		  return rc;
		
		}
	
	public void setData(String path,String sheet,int row,int cell,String data) throws Throwable {
		
		FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
	
	FileOutputStream fos = new FileOutputStream(path);
	wb.write(fos);
	
	}

}














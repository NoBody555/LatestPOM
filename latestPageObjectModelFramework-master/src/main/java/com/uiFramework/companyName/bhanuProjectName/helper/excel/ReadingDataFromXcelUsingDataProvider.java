package com.uiFramework.companyName.bhanuProjectName.helper.excel;

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Iterator;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class ReadingDataFromXcelUsingDataProvider {
	  static FileInputStream fis =null;
	  static XSSFWorkbook wb =null;
	  static String  filePath="C:\\Users\\ccomp\\eclipse-workspace\\com.automationpractice\\Mapcrap1.xlsx";
	   static String  sheetName="Login";
		@Test(dataProvider="getData")
		public void sedingData(String userName, String password) {
			 System.out.println("userName: "+userName+" Password: "+password);
		        
			
		}
		@DataProvider(name="getData")
		public static Object[][]getData() {
			
		Object[] [] obj=	readingData(filePath ,sheetName);
		return obj;
		
		}
		public static Object[][] readingData(String filePath,String sheetName) {
			Object[][] data=null;
			try {
			fis=new FileInputStream(new File(filePath));
			
			wb=new XSSFWorkbook(fis);
			 XSSFSheet sheet = wb.getSheet(sheetName);
			    int rowCount=    sheet.getLastRowNum();
			  int colCount=  sheet.getRow(0).getLastCellNum();
			  data=  new Object [rowCount-1][colCount];
			Iterator<Row> rowsItr = sheet.iterator();
			int i=1;
			while(rowsItr.hasNext()) {
				XSSFRow rows = (XSSFRow)rowsItr.next();
				 int j=0;
				Iterator<Cell> cellsItr = rows.iterator();
				while(cellsItr.hasNext()) {
				XSSFCell cell =	(XSSFCell)cellsItr.next();
					 data[i-1][j++]=cell.getStringCellValue();
				}
			  	   i++;
			}
			
			return data;
			}catch(Exception e) {
			return null;
			}
		}
}

package com.uiFramework.companyName.bhanuProjectName.helper.excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook();
	   XSSFSheet sheet = wb.createSheet("wb.xlsx");
	             
	     Map<String,Object[]> mp = new TreeMap<String,Object[]>();
	     
	      mp.put("1",new Object[]{"name","lastName","Salary"});
	      mp.put("2", new Object[]{"amja","sdfd","90"});
	      mp.put("3", new Object[] {"dljfdl","lfdlfjdl","08408"});
	      mp.put("4", new Object[] {"roe","uie","9030"});
	      
	        Set<String> keys = mp.keySet();
	        int rowid=0,cellid=0;
	          for(String key:keys) {
	        	   Object[] objArr = mp.get(key);
	        	   for(Object obj:objArr) {
	        		        XSSFRow row = sheet.createRow(rowid++);
	        		    XSSFCell cell = row.createCell(cellid++);
	        		       cell.setCellValue((String)obj); 
	        		            
	        		        
	        	   }
	        	   
	          }
	             
	     
	     FileOutputStream fis = new FileOutputStream("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\src\\main\\resources\\cra.xlsx");
	           wb.write(fis);
	           wb.close();
	           fis.close();
		
	                 
	     
	     
	     
	       
		
			
       
	}

}

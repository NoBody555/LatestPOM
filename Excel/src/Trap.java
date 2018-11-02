import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Trap {
	//@Test(dataProvider="getData")
	public void test(Map mapData) {
		System.out.print(mapData.get("userName")+" and password is: ");
		
		System.out.print(mapData.get("password"));
		System.out.println();
	}
	@Test(dataProvider ="getDat")
	public void mapData(Map mapObj) {
		System.out.print(mapObj.get("userName")+" password : ");
		
		System.out.print(mapObj.get("password"));
		System.out.println();
	}
	
	@DataProvider(name="getDat")
	public Object[][] getData() throws IOException{
		File file=new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\Mapcrap1.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet  = wb.getSheetAt(0);
		int rowCount=       sheet.getLastRowNum();
		int colCount =     sheet.getRow(0).getLastCellNum();
		 Object[][] obj = new Object[rowCount][1];
		 for(int i=0; i<rowCount; i++) {
		   Map<Object,Object>maps = new HashMap<Object,Object>();
		  for(int j=0; j<colCount; j++)
			  maps.put(sheet.getRow(0).getCell(j).getStringCellValue(),
					  sheet.getRow(i+1).getCell(j).getStringCellValue());
		     
		         obj[i][0]=maps;
		
		 }
		return obj;
	  
		
	}
	@DataProvider(name="getData")
	public Object[][] getDat() throws IOException{
		//FileInputStream fis = new FileInputStream(new File(""));
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\Mapcrap1.xlsx"));
	  	XSSFWorkbook wb = new XSSFWorkbook(fis);
	     XSSFSheet sheet =	 wb.getSheetAt(0);
	      int rowCount=        sheet.getLastRowNum();
	      int colCount = sheet.getLastRowNum();
	      Object [][] obj = new Object[rowCount][1];
	      for(int i=0; i<rowCount; i++) {
	    	  Map<Object,Object> maps = new HashMap<Object,Object>();
	    	  for(int j=0; j<colCount; j++)
	    		  maps.put(sheet.getRow(0).getCell(j).getStringCellValue(), sheet.getRow(i+1).getCell(j).getStringCellValue());
	    	 
	    	      obj[i][0]=maps;
	    	      
	      }
		  return obj;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String abc="bca";
		String bca="cgb";
		if(abc.length() != bca.length()) {
           System.out.println("string are not equal");
              return;
		}
		 char[] ab= abc.toCharArray();
		   char[]ba=      bca.toCharArray();
		   Arrays.sort(ab);
		   Arrays.sort(ba);
		   System.out.println(Arrays.equals(ab, ba));
	}
     public static void getExcelData(String fileName, String path) {
    	   
    	    Map<String, LinkedHashMap<Integer,List>> outer = new HashMap<String, LinkedHashMap<Integer,List>>();
    	       LinkedHashMap<Integer,List> inner = new LinkedHashMap<Integer,List>();
    	       String sheetName="";
    	       FileInputStream fis = null;
    	       try {
    	    	    fis = new FileInputStream(new File("")); 
    	    	   XSSFWorkbook wb = new XSSFWorkbook();
    	    	               for(int i=0; i<wb.getNumberOfSheets(); i++) {
    	    	            	  XSSFSheet sheet = wb.getSheetAt(i);
    	    	            	        sheetName=     sheet.getSheetName();
    	    	            	        Iterator<Row> rows = sheet.iterator();
    	    	            	        while(rows.hasNext()) {
    	    	            	      XSSFRow row =  (XSSFRow)  rows.next();
    	    	            	      List data = new ArrayList();
    	    	            	      Iterator<Cell>   cells =      row.iterator();
    	    	            	      while(cells.hasNext()) {
    	    	            	    	XSSFCell cell =     (XSSFCell) cells.next();
    	    	            	    	   cell.setCellType(Cell.CELL_TYPE_STRING);
    	    	            	    	   data.add(cell);
    	    	            	      }
    	    	            	            inner.put(row.getRowNum(), data);
    	    	            	            
    	    	            	        }
    	    	            	         outer.put(sheetName, inner);
    	    	            	         inner= new LinkedHashMap<Integer,List>();
    	    	            	         
;    	    	               }
    	       }catch(Exception e) {
    	    	   e.printStackTrace();
    	    	    
    	       }finally {
    	    	   try {
    	    		   if(fis != null)
    	    			   fis.close();
    	    	   }catch(IOException e) {
    	    		   e.printStackTrace();
    	    	   }
    	       }
     }
}

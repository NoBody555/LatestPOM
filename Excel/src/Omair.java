import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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

public class Omair {

	 @Test(dataProvider="getData")
	 public void getExcelData(Map mapObj) {
		 System.out.print(mapObj.get("userName"));
		 System.out.print(mapObj.get("password"));
		 System.out.println();
	 }
	@DataProvider(name="getData")
	public Object[][] getData() throws IOException{
		FileInputStream fis  = new FileInputStream(new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\Mapcrap1.xlsx"));
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		     XSSFSheet sheet = wb.getSheetAt(0);
;		       int rowCount = sheet.getLastRowNum();
  
                int colCount = sheet.getRow(0).getLastCellNum();
                Object[][] obj =  new Object[rowCount][1];
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
   
	}
     public static void getMapData() {
    	 FileInputStream fis = null;
    	 String sheetName = "";
    	 List sheetData = new ArrayList();
    	 try {
    		 fis=new FileInputStream(new File(""));
    		   Map<String,LinkedHashMap<Integer,List>> maps = new HashMap<String,LinkedHashMap<Integer,List>>();
    		   LinkedHashMap<Integer,List> inner = new LinkedHashMap<Integer,List>();
    		       XSSFWorkbook wb = new XSSFWorkbook(fis);
    		          for(int i=0; i<wb.getNumberOfSheets(); i++) {
    		        	XSSFSheet sheet=  wb.getSheetAt(i);
    		        	sheetName=sheet.getSheetName();
    		        	Iterator<Row> rows = sheet.iterator();
    		        	while(rows.hasNext()) {
    		        	XSSFRow row =	    (XSSFRow)rows.next();
    		        	   List data = new ArrayList();
    		        	 Iterator<Cell> cells = row.iterator();
    		        	 while(cells.hasNext()) {
    		        		  XSSFCell cell =    (XSSFCell) cells.next();
    		        		  cell.setCellType(Cell.CELL_TYPE_STRING);
    		        		     data.add(cell);
    		        	 }
    		        	   inner.put(row.getRowNum(), data);
    		        	   
    		        	     sheetData.add(data);
    		        	}
    		        	     maps.put(sheetName, inner);
    		        	     inner = new LinkedHashMap<Integer,List>();
    		          }
    		 
    	 }catch(Exception e) {
    		 e.printStackTrace();
    		 
    	 }finally {
    		 try {
    			if(fis !=null)
    				fis.close();
    		 }catch(Exception e) {
    			 e.printStackTrace();
    		 }
    	 }
    	 
     }
}

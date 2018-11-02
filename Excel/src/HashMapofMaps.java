import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class HashMapofMaps {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,LinkedHashMap<Integer,List>>maps = new HashMap<String,LinkedHashMap<Integer,List>>();
		 LinkedHashMap<Integer,List> inMap = new LinkedHashMap<Integer,List>();
		 
		
       FileInputStream fis = null;
       String sheetName = null;
       // Create an ArrayList to store the data read from excel sheet.
         List sheetData = new ArrayList();
       try {
    	     fis= new FileInputStream("");
    	     XSSFWorkbook wb = new XSSFWorkbook(fis);
    	             for(int i=0; i<wb.getNumberOfSheets(); i++) {
    	            	  XSSFSheet sheet=  wb.getSheetAt(i);
    	            	    sheetName= sheet.getSheetName();
    	       Iterator<Row> rows = sheet.iterator();  
    	       while(rows.hasNext()) {
    	     XSSFRow row = (XSSFRow)  rows.next();
    	      Iterator<Cell> cells = row.iterator();
    	    	   List data = new ArrayList();
    	    	   while(cells.hasNext()) {
    	    		XSSFCell cell = (XSSFCell)cells.next();
    	    		  cell.setCellType(Cell.CELL_TYPE_STRING);
    	    		 
    	    		  data.add(cell);
    	    	   }
    	    	  inMap.put(row.getRowNum(), data);
    	    	   sheetData.add(data);
    	       }
    	            maps.put(sheetName, inMap);
    	            maps = new HashMap<String,LinkedHashMap<Integer,List>>();
    	         
    	      }
       }catch(IOException e) {
    	     e.printStackTrace();
       }finally {
    	   if(fis !=null) {
    		   try {
    			   fis.close();
    		   }catch(IOException e) {
    			   e.printStackTrace();
    		   }
    	   }
       }
	}

}

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class HashMapExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashMap<String,LinkedHashMap<Integer,List>> outer= new HashMap<String,LinkedHashMap<Integer,List>>();
	            LinkedHashMap<Integer,List> inni = new LinkedHashMap<Integer,List>();
	        FileInputStream fis =null;
	        String sheetName ="";
	        try {
	        	fis=new FileInputStream("");
	        XSSFWorkbook wb= new XSSFWorkbook(fis);
	           for(int i=0; i<wb.getNumberOfSheets(); i++) {
	        	 XSSFSheet sheet=   wb.getSheetAt(i);
	        	   sheetName=wb.getSheetName(i);
	        	 Iterator<Row> rows = sheet.iterator();
	        	  while(rows.hasNext()) {
	        	XSSFRow row=	    (XSSFRow) rows.next();
	        	List data = new ArrayList();
	        	  Iterator<Cell> cells = row.iterator();
	        	  while(cells.hasNext()) {
	        		  XSSFCell cell =       (XSSFCell) cells.next();
	        		   cell.setCellType(Cell.CELL_TYPE_STRING);
	        		  data.add(cell);
	        	  }
	        	    inni.put(row.getRowNum(), data);
	        	  }
	        	  outer.put(sheetName, inni);
	        	 inni = new LinkedHashMap<Integer, List>();
	           }
	          
	        }
	         catch(Exception e) {
	        	 
	        	 
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

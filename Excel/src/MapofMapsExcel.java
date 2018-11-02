import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MapofMapsExcel {

	private static final String XSSFCell = null;

	public static void main(String[] args) {
		String fileName="";
		
		// TODO Auto-generated method stub
      /*HashMap<String, LinkedHashMap<Integer,List>>superMap = 
    		  new LinkedHashMap<String,LinkedHashMap<Integer,List>>();*/
		 // Used the LinkedHashMap and LikedList to maintain the order
		HashMap<String, LinkedHashMap<Integer,List>> outerMap = 
				new LinkedHashMap<String, LinkedHashMap<Integer, List>>();
      LinkedHashMap<Integer,List> hashMap = new LinkedHashMap<Integer,List>();
      String sheetName = null;
   // Create an ArrayList to store the data read from excel sheet.
      List sheetData = new ArrayList();
      
      FileInputStream fis = null;
      try {
    	  fis = new FileInputStream(fileName);
    	  //create an Excel workbook from the file system
    	   XSSFWorkbook wb = new XSSFWorkbook(fis);
    	   //get the first sheet on the workbook.
    	   for(int i=0; i<wb.getNumberOfSheets(); i++) {
    		XSSFSheet sheet = wb.getSheetAt(i); 
    		  sheetName = wb.getSheetName(i);
    		     Iterator<Row> rows = sheet.iterator();
    		      
				while(rows.hasNext()) {
    		    XSSFRow	row =   (XSSFRow) rows.next();
    		     Iterator<Cell> cells = row.iterator();
    		     List data = new	LinkedList();
    		     while(cells.hasNext()) {
    		    	XSSFCell cell = (XSSFCell) cells.next();
    		    
    		       cell.setCellType(Cell.CELL_TYPE_STRING);
    		       data.add(cell);
    		    }
    	             hashMap.put(row.getRowNum(),data);
    	              sheetData.add(data);
    		}
		    		outerMap.put(sheetName, hashMap);
		    		hashMap = new LinkedHashMap<Integer, List>();
    		
    	   }
        }catch(IOException e) {
    	  e.printStackTrace();
         }finally {
    	  if(fis != null) {
    		  try {
    			  fis.close();
    		  }catch(IOException e) {
    			  e.printStackTrace();
    		  }
    	  }
      }
   System.out.println(findLongestUniqueSring("abcfstopp"));
                  getDate();
	}
	public static boolean isStringUnique(String str) {
		boolean isUnique = false;
		for(char ch:  str.toCharArray()) {
			 if(str.indexOf(ch)==str.lastIndexOf(ch)) 
				   isUnique=true;
	        else {
					   isUnique=false;;
					   break;
				   }
			 
			
		}
		return isUnique;
	}
      public static int findLongestUniqueSring(String str) {
    	  int len=0;
    	     Map<Character,Integer> maps = new HashMap<Character,Integer>();
    	    for(char ch:str.toCharArray()) {
    	    	if(!maps.containsKey(ch)) 
    	    		maps.put(ch, 1);
    	    	else {
    	    		System.out.print(maps.toString());
    	    		len= Math.max(len, maps.size());
    	    		maps.clear();
    	    	}
    	    }
    	     return len;
      }
      public static void getDate() {
    	  SimpleDateFormat frmt = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    	  Date date = new Date();
    	  System.out.println(frmt.format(date.getTime()));
      }
}

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Map<String,LinkedHashMap<Integer,List>>outerMap = new HashMap<String,LinkedHashMap<Integer,List>>();
	  LinkedHashMap<Integer,List> map = new LinkedHashMap<Integer,List>();
	  FileInputStream fis = null;
	  
	  String sheetName="";
		  ;
	  // Create an ArrayList to store the data read from excel sheet.
	  List sheetData = new ArrayList();
	  try {
		  File file = new File("");
		    fis=new FileInputStream(file);
		    XSSFWorkbook wb = new XSSFWorkbook(fis);
		     
		    for(int i=0; i<wb.getNumberOfSheets();i++) {
		    	XSSFSheet sheet = wb.getSheetAt(i);
		    	  sheetName=           wb.getSheetName(i);
		    	Iterator<Row> rows = sheet.iterator();
		    	while(rows.hasNext()) {
		    		XSSFRow row = (XSSFRow) rows.next();
		    		ArrayList data = new ArrayList();
		    		 Iterator<Cell> cells = row.iterator();
		    		 while(cells.hasNext()) {
		    		XSSFCell cell=	(XSSFCell) cells.next();
		    		   cell.setCellType(Cell.CELL_TYPE_STRING);
		    		 data.add(cell);
		    		 }
		    		   map.put(row.getRowNum(),data);
		    		   map=new LinkedHashMap<Integer,List>();
		    		   
		    	}
		    	  outerMap.put(sheetName, map);
		    	  sheetData.add(map);
		    }
		    
		    
	  }catch(Exception e) {
		  
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

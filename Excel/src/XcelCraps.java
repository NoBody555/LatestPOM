import java.io.FileInputStream;
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
public class XcelCraps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //create a hashmap
		HashMap<String,LinkedHashMap<Integer,List>> outer = new HashMap<String,LinkedHashMap<Integer,List>>();
		  LinkedHashMap<Integer,List> maps = new LinkedHashMap<Integer,List>();
		 //create a sheetName
		  String sheetName = null;
		    List sheetData = new ArrayList<>();
		    FileInputStream fis = null;
		    try {
		    	fis=new FileInputStream("");
		    	XSSFWorkbook wb  = new XSSFWorkbook(fis);
		    	for(int i=0; i<wb.getNumberOfSheets(); i++) {
		    		 XSSFSheet sheet =    wb.getSheetAt(i);
		    		   sheetName=  sheet.getSheetName();
		    		Iterator<Row> rows =   sheet.iterator();
		    		  while(rows.hasNext()) {
		    			XSSFRow row = (XSSFRow)   rows.next();
		    			    List data = new ArrayList();
		    			Iterator<Cell> cells = row.iterator();
		    			while(cells.hasNext()) {
		    			XSSFCell	cell= (XSSFCell)    cells.next();
		    			    cell.setCellType(Cell.CELL_TYPE_STRING);
		    			    data.add(cell);
		    			}
		    			    maps.put(row.getRowNum(), data);
		    		  }
		    		       outer.put(sheetName, maps);
		    		      maps= new LinkedHashMap<Integer,List>();
		    	}
		    }catch(Exception e) {
		    	e.printStackTrace();
		    	
		    }
	}

}

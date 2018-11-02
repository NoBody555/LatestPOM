

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
public class MapsofMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //createa  a filname
                  String fileName="";
            //declare a hashMap that contains string and linkedHashMap
                  HashMap<String,LinkedHashMap<Integer,List>>outerMap = new HashMap<String,LinkedHashMap<Integer,List>>();
                  
           //which contains an integer, and list
             //decalare linkedHashmap<Integer,list>
                  LinkedHashMap<Integer,List> map  = new LinkedHashMap<Integer,List>();
                  
              //set the sheetname to be null;
                  String sheetName = null;
              //  create a list of ArrayLIst that contains the sheetdata
                  List sheetData = new ArrayList();
          //  Fis=null;
                  FileInputStream fis=null;
            //  //  try{ 
                  try {
                  //set the fis
                	  fis = new FileInputStream("");
                	  
                  //wb
                	   XSSFWorkbook wb = new XSSFWorkbook(fis);
               // loop through no of sheets
                	   for(int i=0;i<wb.getNumberOfSheets(); i++) {
                		   
                	   
              // intialize the sheet
                		     XSSFSheet sheet =      wb.getSheetAt(i);
            // set the sheetName by getting the sheetNam
                		sheetName=      sheet.getSheetName();
           //   iterate through the sheet returns rows
                    Iterator<Row>rows =   sheet.iterator();
          // loop through rows hasnext
                    while(rows.hasNext()){
  //         declare a List of LinkedList
                    	List data = new LinkedList();
                        XSSFRow row =(XSSFRow)rows.next();
          // loop though the cell using hasNext
                Iterator<Cell>    cellIterator =         row.iterator();
                while(cellIterator.hasNext()) {
                	 XSSFCell cell =  (XSSFCell) cellIterator.next();
                	    //setcelltype(String)
                     //add data to the list
                	     cell.setCellType(Cell.CELL_TYPE_STRING);
                	     data.add(cell);
                
           
             //cell loop close
                }//add data to the hashMap(row.getRowNum,data);
                            map.put(row.getRowNum(),data);
                            //close the row loop
                 }
        
          // put sheetName and HashMap
                       outerMap.put(sheetName, map);  
           //delcare a new hashMap of LinkedHashMap
                    map = new LinkedHashMap<Integer,List>();
                    }
                  }catch(Exception e) {
                	  e.printStackTrace();
                  }  /*finally {
                	  if(fis != null) {
                		  try {
                			  fis.close();
                		  }catch(IOException e) {
                			  e.printStackTrace();
                		  } */  	
                          finally {
                        	  if(fis != null) {
                        		  try {
                        			  fis.close();
                        		  }catch(IOException e) {
                        			  e.printStackTrace();
                        		  }
                        	  }
                          }

	}

}

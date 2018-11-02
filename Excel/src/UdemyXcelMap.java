import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UdemyXcelMap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
         List<Map<String,String>>collection= new ArrayList<>();
         Map<String,String> row1 = new LinkedHashMap<>();
           row1.put("id","1");
           row1.put("Name", "value");
           collection.add(row1);
           Map<String,String>row2 = new LinkedHashMap<>();
           
           row2.put("id","2");
           row2.put("Name", "palue");
           collection.add(row2);
           
         String f ="C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\resources\\configfile\\testData.xlsx";
           File ff=new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\resources\\configfile\\testData.xlsx");
        // writeXcelFile(new File(f), "Sheet4", collection);
         writeCollection(new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\resources\\configfile\\testData.xlsx"), "Sheet4", collection);
         
	}
	public static void writeXcelFile(File file, String sheetName, List<Map<String,String>> collection) throws Exception {
		try {
			//create a fileInputstream
			FileInputStream fis = new FileInputStream(file);
			//create a workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			    XSSFSheet sheet = wb.getSheet(sheetName);
			    //count no of rows
			     int rows =   sheet.getLastRowNum();
			       rows += 1;
			   //loop throught the collection
			       for(int index =0; index<collection.size(); index++) {
			    	              //create a row
			    	           XSSFRow row = sheet.createRow(rows++);
			    	           //get the rowObject from collection using index
			    	          Map<String, String> rowObj = collection.get(index);
			    	          //loop throught rowObj to getthe colName fromKeys
			    	          for(String colName:rowObj.keySet()) {
			    	        	   int celIndex=        getColumnIndex(sheet, colName);
			    	        	   
			    	        	   if(celIndex != -1) {
			    	        		      XSSFCell cel = row.createCell(celIndex);
			    	        		      cel.setCellValue(rowObj.get(colName));
			    	        	   }
			    	          }
			       }
			FileOutputStream fout = new FileOutputStream(file);
			wb.write(fout);
			fout.close();
		}
		   
		
		
		catch(Exception e) { throw e;}
		      
		
		
	}
	/*
	
	*   public static int getColumnIndex(XSSFSheet sheet, String columnName) {
    int columnIndex = -1;
    try {
        int colNum = sheet.getRow(0).getLastCellNum();
        
	*
	*/
          /* public static int getColumnIndex(XSSFSheet sheet, String cName) {
        	   int columnIndex=-1;
        	   try {
        		          
        		          //getlastCellNumber
        		          int cols =   sheet.getRow(0).getLastCellNum();
        		              //get the firstRow 
        		                XSSFRow firstRow = sheet.getRow(0);
        		            	  //loop through colNumbers
        		            	  for(int colIndex=0; colIndex<cols; colIndex++) {
        		            	   // getcolindexof the first row's cell
        		            	          XSSFCell cell = firstRow.getCell(colIndex);
        		            		   //convert cel to strin see if the matches the colname
        		            	        if(cell.toString().equals(cName))
        		            		   columnIndex = colIndex;
        		            	   
        		              }
        	   }catch(Exception e) {throw e;}
        	   return columnIndex;
           }*/
           
         
        	 
	 
	 
	private static void writeCollection(File file, String sheetName, List<Map<String, String>> collection) throws Exception {
	    try {
	        FileInputStream fileInputStream = new FileInputStream(file);
	        XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
	        XSSFSheet sheet = workBook.getSheet(sheetName);
	        int rows = sheet.getLastRowNum();
	        fileInputStream.close();
	        rows = rows + 1;
	 
	        for (int index = 0; index < collection.size(); index++) {
	            XSSFRow row = sheet.createRow(rows++);
	            Map<String, String> rowObject = collection.get(index);
	            for (String columnName : rowObject.keySet()) {
	                int cellIndex = getColumnIndex(sheet, columnName);
	                if (cellIndex != -1) {
	                    XSSFCell cell = row.createCell(cellIndex);
	                    cell.setCellValue(rowObject.get(columnName));
	                }
	            }
	        }
	        FileOutputStream out = new FileOutputStream(file);
	        workBook.write(out);
	        out.close();
	    
	      } catch (Exception e) {
	        throw e;
	    }
	}
	 
	public static int getColumnIndex(XSSFSheet sheet, String columnName) {
	    int columnIndex = -1;
	    try {
	        int colNum = sheet.getRow(0).getLastCellNum();
	        XSSFRow firstRow = sheet.getRow(0);
	        for (int colIndex = 0; colIndex < colNum; colIndex++) {
	            XSSFCell cell = firstRow.getCell(colIndex);
	            if (cell.toString().equals(columnName)) {
	                columnIndex = colIndex;
	            }
	        }
	    } catch (Exception e) {
	        throw e;
	    }
	    return columnIndex;
	}

}

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelCrap {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<String, LinkedHashMap<Integer, List>> crp = excelCrap();
        
         Set<String> keys = crp.keySet();
          
                
        		          
        	 
           
           
             /*  for(String key:keys) {
            	   System.out.println(key);
            	 Iterator<List> values = crp.get(key).values().iterator();
                       
                       int i=0;
                       while(values.hasNext()) {
                    	    List row = values.next();
                    	  Iterator cell = row.iterator();
                    	  
                     	  while(cell.hasNext()) {
                    	         String com=   cell.next().toString();
                    	         
                    	        if(com.equalsIgnoreCase("runMode"))
                    	        	System.out.println(com);
                    	        
                    		  System.out.print(cell.next().toString()+" ");
                    		 
                    	  }
                    	  System.out.println();
                       }
            	       System.out.println("**************************NextSheet***********************************");
               }
         */
         
         
         
         
         
         
         
         
         
         
			// System.out.println("\n"+crp);
             for(String key: keys) {
            	System.out.println("sheetName: "+key+" \n sheetData");
                //System.out.println(key+": \n values: "+crp.get(key).values());
             Iterator<List> li = crp.get(key).values().iterator();
               int i=0;
               //iterating throw the rows of the same Sheet
               
                 
                	 
                while(li.hasNext())
                { 
                	//iterating throw the rows of the same Sheet
                    List nu = li.next();
                   Iterator jh = nu.iterator();
                   if(i==0) {
                	  System.out.print("Columns names: ");
                	  System.out.print("row: "+i);
                	  System.out.println();
                   } else {
                	  
                	   System.out.print("data: ");
                     System.out.print("row- "+i+": ");
                     System.out.println();
                   }
                 
                  //iterating through values in a column
                    while(jh.hasNext()) {
                    	   String com = jh.next().toString();
                    	   
                    	if(com.equalsIgnoreCase("runMode"))
                      	  System.out.print(com+" :son of a bitch");
                    	else if(com.equals(" "))
                    		System.out.println("       ");
                    	else
                          System.out.print(com+" ");
                    	
                  
                }
                    //moving to the next column of the sameSheet
                    System.out.println();
                    i++;
                }
                if(!(key.toString().equalsIgnoreCase("sheet4")))
                System.out.println("********************NextSheet***********************");
             }
        }
                  
                  
            
	public static  HashMap<String, LinkedHashMap<Integer, List>> excelCrap() {
		   HashMap<String,LinkedHashMap<Integer,List>> outer = new HashMap<String, LinkedHashMap<Integer,List>>();
           LinkedHashMap<Integer, List> inner = new LinkedHashMap<Integer,List>();
           String sheetName="";
      List sheetData = new ArrayList();
        FileInputStream fis = null;
         try {
         	File f= new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\resources\\configfile\\testData.xlsx");
         	fis = new FileInputStream(f);
         	 XSSFWorkbook wb = new XSSFWorkbook(fis);
         	 System.out.println(wb.getNumberOfSheets());
         	     for(int i=0; i< wb.getNumberOfSheets(); i++) {
         	     XSSFSheet sheet =    wb.getSheetAt(i);
         	    	 sheetName =  wb.getSheetName(i);
         	    	     Iterator<Row> rowsIterator = sheet.iterator();
         	    	     while(rowsIterator.hasNext()) {
         	    	    	 XSSFRow    rows =  (XSSFRow) rowsIterator.next();
         	    	    	 Iterator<Cell> celliterator = rows.cellIterator();
         	    	  List data = new LinkedList();  	 
         	    	    	 while(celliterator.hasNext()) {
         	    	   XSSFCell cell =    (XSSFCell)celliterator.next();
         	    	        cell.setCellType(Cell.CELL_TYPE_STRING); 
         	    	        data.add(cell);
         	    	    	 }
         	    	    	 inner.put(rows.getRowNum(), data);  
         	    	    	 sheetData.add(data);
         	    	     }
         	    	         outer.put(sheetName, inner);
         	    	         inner = new LinkedHashMap<Integer, List>(); 
         	     }
         }catch(Exception e) {
         	
         	
         }finally {
         	 if(fis!=null) {
         		try {
         			fis.close();
         		}catch(Exception e) {
         			e.printStackTrace();
         		}
         	 }
         	 
               
         	 return outer;
         }
            
	}

}
